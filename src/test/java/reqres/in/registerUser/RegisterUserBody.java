package reqres.in.registerUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterUserBody {
        private String email;
        private String password;


    }


