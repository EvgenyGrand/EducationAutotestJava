package reqres.in.GetListUsers;

import io.qameta.allure.Description;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import lombok.Builder;
import lombok.Data;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import reqres.in.Specifications;


import java.util.List;

import static io.restassured.RestAssured.given;

@Data
@Builder
public class ReqresGetListUser_Test extends Specifications {

    public final static String URL = "https://reqres.in/";
    public final static String spec = "api/users?page=5";

    @Test
    @Description("ѕолучение списка пользователлей и проверка на сожержание почты корректного домена")
    public void CheckAvatarAndEmail() {
     Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecstatus200());
        List<UserDataGetListUser> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(spec)
                .then().log().all()
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemaAPi/reqres.in/GetListUser.json"))
                .extract().body().jsonPath().getList("data",UserDataGetListUser.class);
        users.forEach(x-> Assertions.assertThat(x.getAvatar().contains(x.getId().toString())));
        Assertions.assertThat(users.stream().allMatch(s -> s.getEmail().endsWith("@reqres.in")));
    }

}
