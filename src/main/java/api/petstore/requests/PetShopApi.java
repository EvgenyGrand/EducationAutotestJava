package api.petstore.requests;

import api.petstore.dto.GetOrderId;
import api.petstore.dto.PostUserPetShopDto;
import io.restassured.response.ValidatableResponse;
import lombok.Data;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;


@Data
public class PetShopApi extends BaseParamApi {

    private static final String USER = "/user";
    private static  String ORDERID = "/store/order/1";


    public ValidatableResponse createUsers(PostUserPetShopDto postUserPetShopDto) {

        return given(spec)
                .body(postUserPetShopDto)
                .when()
                .post(USER)
                .then()
                .log().all();
    }

    public ValidatableResponse getOrderId(GetOrderId orderId) {
        return given(spec)
                .when()
//                .queryParam("orderId", 5)
                .get(ORDERID)
                .then()
                .log().all();
    }
}
