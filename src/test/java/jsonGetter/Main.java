package jsonGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class Main {
    @Test
    public void test() throws JsonProcessingException {
        MyBean bean = new MyBean(1,"My bean");
        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
    }
}
