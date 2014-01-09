package pl.wiktor.lukasz;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
    
    public Message testMethod() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.USE_ANNOTATIONS, true);
        Class<Message> instanceType = Message.class;
    
        String msgBody = "{\"producer\": \"clientApp\", \"type\": \"aType\", \"thirdField\": []}";
        return objectMapper.readValue(msgBody, instanceType);
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(new Test().testMethod());
    }
 }