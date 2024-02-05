package com.example.spring17restconsumingapis.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@JsonPropertyOrder(
        { "infoOrigen", "code" , "user"}
)

public class ReponseMapper {

    User [] user;
    String infoOrigen;
    String code;

    public ReponseMapper(User[] user, String infoOrigen, String code) {
        this.user = user;
        this.infoOrigen = infoOrigen;
        this.code = code;
    }
}
