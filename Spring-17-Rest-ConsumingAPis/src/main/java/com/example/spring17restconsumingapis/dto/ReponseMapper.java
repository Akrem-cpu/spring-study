package com.example.spring17restconsumingapis.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@JsonPropertyOrder(
        { "infoOrigen", "code" ,"data" }
)

public class ReponseMapper {

    Object data;
    String infoOrigen;
    String code;

    public ReponseMapper(Object data, String infoOrigen, String code) {
        this.data = data;
        this.infoOrigen = infoOrigen;
        this.code = code;
    }
}
