package jsonRootName;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// CHANGING THE OBJECT NAME FOR JSON SERIALIZATION
@JsonRootName(value = "user")
public class UserWithRoot {
    public int id;
    public String name;

}
