package jsonRootName;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

public class Main {
    @Test
    public void test() throws JsonProcessingException {
        UserWithRoot user = new UserWithRoot(1,"John");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        String result = mapper.writeValueAsString(user);

        System.out.println(result);
    }
}
