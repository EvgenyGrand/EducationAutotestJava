package reqres.in.registerUser;


import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SuccessRegisterResponse {
    public Integer id;
    public String token;

}
