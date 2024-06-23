package com.example.spring17restconsumingapis.controller;

import com.example.spring17restconsumingapis.enitity.AccountDetails;
import com.example.spring17restconsumingapis.enitity.Genre;
import com.example.spring17restconsumingapis.enitity.MovieCinema;
import com.example.spring17restconsumingapis.repository.AccountRepository;
import com.example.spring17restconsumingapis.repository.GenreRepository;
import com.example.spring17restconsumingapis.repository.MovieCinemaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.function.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestController
@Tag(name = "WebClient")
public class Consume_WebClient {
    @Autowired
    private  MovieCinemaRepository movieCinemaRepository;
    @Autowired
    private  GenreRepository genreRepository;
    @Autowired
    AccountRepository accountRepository;

    private WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();

    @GetMapping("/flux-movie-cinemas")
    @Operation(summary = "hello every one")
    @ApiResponse(responseCode = "300" , description = "found", content = @Content(mediaType = "application/json"))
    @ApiResponse(responseCode = "200" , description = "note found", content = @Content)
    public Flux<AccountDetails> getAllCinemasFlue(){


        return Flux.fromIterable(accountRepository.findAll());
    }
//    @GetMapping("/mono-movie-cinemas/{id}")
//    public Mono<AccountDetails> readByIdMono(@PathVariable("id") Long id){
//
//
//        return Mono.just(accountRepository.getReferenceById(id));
//    }

    @GetMapping("/mono-movie-cinemas/{id}")
    public ResponseEntity<Mono<AccountDetails>> readByIdMono(@PathVariable("id") Long id){
        return ResponseEntity.ok(Mono.just(accountRepository.getReferenceById(id)));
    }

    @PostMapping("/create-genra")
    public ResponseEntity<Mono<String>> creat(@RequestBody Genre genre){
        genreRepository.save(genre);
        return ResponseEntity.status(HttpStatus.ACCEPTED).header("finally","you are done")
                .body(Mono.just("genre created successfully"));
    }


  @GetMapping("/flux")
    public Flux<AccountDetails> readWithWebClient(){


        return webClient.get().uri("/flux-movie-cinemas")
                .retrieve().bodyToFlux(AccountDetails.class);
  }

    @GetMapping("/mono/{id}")
    public Flux<AccountDetails> readWithWebClient(@PathVariable("id") Long id, @RequestHeader String name){

        System.out.println(name);
        return webClient.get().uri("/mono-movie-cinemas/"+id)
                .retrieve().bodyToFlux(AccountDetails.class);
    }


}
