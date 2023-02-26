package api.requests;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public abstract class BaseParamApi {

    protected static final String BASE_URI = "https://petstore.swagger.io/v2/";
    protected RequestSpecification spec;

    public BaseParamApi() {
        spec = given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
//                .auth().oauth2()
                .log().all();


    }
}
