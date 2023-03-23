package reqres.in.GetListUsers;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDataGetListUser {
        public Integer id;
        public String email;
        public String first_name;
        public String last_name;
        public String avatar;
    }

