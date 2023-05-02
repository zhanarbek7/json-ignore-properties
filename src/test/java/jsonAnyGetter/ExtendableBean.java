package jsonAnyGetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

/**
 * When se serialize an instance of the entity,
 * we get all the key-values in the Map
 * as standard, plain properties
 * not as object one
 */
public class ExtendableBean {
    public String name;
    private Map<String, String> properties;

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }

    public ExtendableBean(String name) {
        this.properties = new HashMap<String, String>();
        this.name = name;
    }

    public void add(String key, String value){
        this.properties.put(key, value);
    }
}
