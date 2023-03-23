package reqres.in.registerUser;
import io.restassured.module.jsv.JsonSchemaValidator;
import lombok.Builder;
import lombok.Data;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import reqres.in.Specifications;

import static io.restassured.RestAssured.given;

@Data
@Builder
public class SuccessRegisterUser_Test extends Specifications {

    public final static String spec = "api/users?page=5";

    @Test
    public void succesfulRegisterUser() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecstatus200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";

        RegisterUserBody registerUserBody = new RegisterUserBody("eve.holt@reqres.in", "pistol");
        SuccessRegisterResponse successRegisterResponse = given()
                .body(registerUserBody)
                .when()
                .post("api/register")
                .then()
                .log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemaAPi/reqres.in/SucessfulRegisterUser.json"))
                .extract().as(SuccessRegisterResponse.class);
        Assertions.assertThat(id).isEqualTo(successRegisterResponse.getId());
        Assertions.assertThat(token).isEqualToIgnoringCase(successRegisterResponse.getToken());

    }
}
