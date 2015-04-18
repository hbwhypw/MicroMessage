package com.message.frame;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonDateSerializer extends JsonSerializer<Date> {  
    @Override  
    public void serialize(Date arg0, JsonGenerator arg1, SerializerProvider arg2)  
            throws IOException, JsonProcessingException {  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        String formattedDate = formatter.format(arg0);  
        arg1.writeString(formattedDate);  
    }  
}  
