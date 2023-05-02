package jsonRawValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class Main {

    @Test
    public void test() throws JsonProcessingException {
        RawBean bean = new RawBean("My bean", "{\"attr\":false}");
        String result = new ObjectMapper().writeValueAsString(bean);
        System.out.println(result);
    }
}
