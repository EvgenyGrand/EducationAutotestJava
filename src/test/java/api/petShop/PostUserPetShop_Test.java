package api.petShop;

import api.dto.PostUserPetShopDto;
import api.requests.UserPetShopApi;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostUserPetShop_Test {

    @DisplayName("Создание пользователя в магазине PetStore")
    @Test
    public void CheckCreateUser(){

        UserPetShopApi userPetShopApi = new UserPetShopApi();

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
                .statusCode(200)
                .body("code",equalTo(200))
                .body("type",equalTo("unknown"))
                .body("message",equalTo("12"));
    }


}
