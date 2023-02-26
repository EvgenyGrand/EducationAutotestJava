package api.requests;

import api.dto.PostUserPetShopDto;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import lombok.Data;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;


@Data
public class UserPetShopApi extends BaseParamApi{

    private static final String USER = "/user";


    public ValidatableResponse createUsers(PostUserPetShopDto postUserPetShopDto){

    return given(spec)
                .body(postUserPetShopDto)
          .when()
            //get - запрос с параметрами (-47 минут в видео)
//            .queryParam()

            //post- запрос с телом
                .post(USER)

          .then()
                .log().all();
    }
}
