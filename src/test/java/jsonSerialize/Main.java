package jsonSerialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    @Test
    public void test() throws ParseException, JsonProcessingException {
        SimpleDateFormat df
                = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);
        Event event = new Event("party",date);
        String result = new ObjectMapper().writeValueAsString(event);
        System.out.println(result);
    }

}
