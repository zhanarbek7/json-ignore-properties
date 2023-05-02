package jsonValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        String enumString = new ObjectMapper().writeValueAsString(TypeEnumWithValue.TYPE1);
        System.out.println(enumString);
    }
}
