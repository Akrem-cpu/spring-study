package com.example.spring17restconsumingapis.controller;

import com.example.spring17restconsumingapis.dto.ReponseMapper;
import com.example.spring17restconsumingapis.dto.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class Consume_RestTemplate {


    private final String URI = "https://jsonplaceholder.typicode.com/users";
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<ReponseMapper> getUsers(){

        User[] responseEntity = restTemplate.getForEntity(URI,User[].class).getBody();
        ReponseMapper body = new ReponseMapper(responseEntity,"this info is coming from endpoint:- RestTemplate ","cd-99");
        return ResponseEntity.status(HttpStatus.OK)
                .body(body);
    }

    @GetMapping("{id}")
    public Object getUsersById(@PathVariable("id") Integer id){

      return restTemplate.getForObject(URI+"/{id}",Object.class,id);
    }

    @GetMapping("/test")
    public ResponseEntity<Object> consumeFromDummyApi(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("app-id","6298ebfecd0551211fce37a6");
         HttpEntity<String> entity = new HttpEntity<>(headers);
       ResponseEntity<Object> response = restTemplate.exchange("https://dummyapi.io/data/v1/user?limit=10",HttpMethod.GET,entity,Object.class);
        return response;
    }

}
