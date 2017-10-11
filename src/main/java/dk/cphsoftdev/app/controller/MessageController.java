package dk.cphsoftdev.app.controller;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class MessageController {

    private Object object;
    private String json;
    private ObjectMapper mapper;

    public MessageController(String json) {
        this.json = json;
        this.mapper = new ObjectMapper();
    }

    public MessageController(Object object) {
        this.object = object;
        this.mapper = new ObjectMapper();
    }

    public String asString() {
        try
        {
            json = mapper.writeValueAsString(object);
            return json;
        }
        catch(IOException e)
        {
            return null;
        }
    }

    public byte[] asByteArray() {
        try
        {
            return mapper.writeValueAsBytes(object);
        }
        catch(IOException e)
        {
            return null;
        }
    }

    public JsonNode getAttribute(String name) {
        try
        {
            return mapper.readTree(json).get(name);
        }
        catch(IOException e)
        {
            return null;
        }
    }
    
}
