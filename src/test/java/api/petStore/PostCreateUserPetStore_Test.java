package api.petStore;
import api.petstore.dto.PostUserPetShopDto;
import api.petstore.requests.PetShopApi;
import io.qameta.allure.Description;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostCreateUserPetStore_Test {

    @Description("Создание пользователя в магазине PetStore")
    @Test
    public void CheckCreateUser() {

        PetShopApi userPetShopApi = new PetShopApi();

        PostUserPetShopDto user = PostUserPetShopDto.builder()
                .id(12)
                .username("Ivan_Petrov")
                .firstName("Ivan")
                .lastName("Petrov")
                .email("info@info.com")
                .password("qwerty")
                .phone("899999999")
                .userStatus(1)
                .build();


        userPetShopApi.createUsers(user)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/petstore/CreateUser.json"))
                .statusCode(200)
                .body("code", equalTo(200))
                .body("type", equalTo("unknown"))
                .body("message", equalTo("12"));

    }


}
