package io.reflectoring.buckpal.account.domain.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.reflectoring.buckpal.account.domain.dtos.PhoneDto;
import io.reflectoring.buckpal.account.domain.dtos.UserDto;

import java.io.IOException;

public class PhoneDtoSerialize extends StdSerializer<PhoneDto> {

    public PhoneDtoSerialize(){
        this(null);
    }

    protected PhoneDtoSerialize(Class<PhoneDto> t){
        super(t);
    }

    @Override
    public void serialize(PhoneDto value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        jgen.writeStartObject();
        jgen.writeObjectField("number", value.getNumber());
        jgen.writeObjectField("cityCode", value.getCityCode());
        jgen.writeObjectField("contryCode", value.getContryCode());
        jgen.writeEndObject();
    }
}
