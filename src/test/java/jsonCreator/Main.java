package jsonCreator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void test() throws JsonProcessingException {
        String json = "{\"id\":1,\"theName\":\"My bean\"}";
        BeanWithCreator bean = new ObjectMapper()
                .readValue(json, BeanWithCreator.class);
        Assert.assertEquals("My bean", bean.name);
    }
}
