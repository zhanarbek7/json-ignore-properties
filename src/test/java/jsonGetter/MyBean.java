package jsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
/**
 * JsonGetter changes the name of property
 * when it is serialized
 * In this case, there will be 2 properties
 * {id:1, our-name:My bean}
 *
 *
 * JsonPropertyOrder changes order of properties
 * as we give their names
 */
//@JsonPropertyOrder({"name","id"})
@JsonPropertyOrder(alphabetic = true)
public class MyBean {
    public int id;
    private String name;

    @JsonGetter("our-name")
    public String getName(){
        return name;
    }


}
