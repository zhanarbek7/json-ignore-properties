package pl.wiktor.lukasz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "thirdField" })
public class Message {

    private String type;
    private String producer;
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getProducer() {
        return producer;
    }
    
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Message [type=" + type + ", producer=" + producer + "]";
    }
    
}
