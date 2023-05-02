package jsonPropertyOrder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonGetter.MyBean;
import org.junit.Test;

public class Main {
    @Test
    public void someTest() throws JsonProcessingException {
        MyBean myBean = new MyBean(1,"My bean");
        String result = new ObjectMapper().writeValueAsString(myBean);
        System.out.println(result);
    }
}
