package reqres.in.registerUser;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuccessRegisterResponse {
    public Integer id;
    public String token;

}
