package reqres.in.registerUser;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterUserBody {
        private String email;
        private String password;
    }

