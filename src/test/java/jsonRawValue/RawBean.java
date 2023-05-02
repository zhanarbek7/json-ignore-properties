package jsonRawValue;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class RawBean {
    public String name;

    // value will be shown after serialization
    // as it was saved
    @JsonRawValue
    public String json;

}
