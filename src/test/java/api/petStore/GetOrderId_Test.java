package api.petStore;
import api.petstore.dto.GetOrderId;
import api.petstore.requests.PetShopApi;
import io.qameta.allure.Description;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetOrderId_Test {

    @Description("Получение ID заказа в магазине PetStore")
    @Test
    public void CheckOrderId() {

        PetShopApi userPetShopApi = new PetShopApi();

        GetOrderId orderId = GetOrderId.builder()
                .orderid(5)
                .build();

        userPetShopApi.getOrderId(orderId)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/petstore/GetOrderId.json"))
                .statusCode(200)
                .body("id", equalTo(5));

    }


}
