package reqres.in;

import io.restassured.http.ContentType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;


public class ReqresGetListUser {

    public final static String URL = "https://reqres.in/";
    public final static String spec = "api/users?page=5";

    @Test
    public void CheckAvatarAndEmail() {
     Specifications.installSpecification(Specifications.requestSpec(URL),Specifications.responseSpecstatus200());
        List<UserDataGetListUser> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(spec)
                .then().log().all()
                .extract().body().jsonPath().getList("data",UserDataGetListUser.class);
        users.forEach(x-> Assertions.assertThat(x.getAvatar().contains(x.getId().toString())));
        Assertions.assertThat(users.stream().allMatch(s -> s.getEmail().endsWith("@reqres.in")));
    }

}
