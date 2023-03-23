
package api.petstore.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostUserPetShopDto {


    private String email;
    private String firstName;
    private int id;
    private String lastName;
    private String password;
    private String phone;
    private int userStatus;
    private String username;

}
