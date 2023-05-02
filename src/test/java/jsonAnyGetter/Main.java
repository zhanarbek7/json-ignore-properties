package jsonAnyGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class Main {
    @Test
    public void whenSerializingUsingJsonAnyGetter_thenCorrect(){
        ExtendableBean bean = new ExtendableBean("My bean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        try {
            String result = new ObjectMapper().writeValueAsString(bean);
            System.out.println(result);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
