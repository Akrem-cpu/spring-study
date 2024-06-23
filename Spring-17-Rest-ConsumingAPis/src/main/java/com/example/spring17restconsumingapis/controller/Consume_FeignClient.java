//package com.example.spring17restconsumingapis.controller;
//
//import com.example.spring17restconsumingapis.client.EmployeeClient;
//import com.example.spring17restconsumingapis.client.UserClient;
//import com.example.spring17restconsumingapis.dto.ReponseMapper;
//import com.example.spring17restconsumingapis.dto.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Consume_FeignClient {
//
//
//    UserClient userClient;
//
//    EmployeeClient employeeClient;
//
//    public Consume_FeignClient(UserClient userClient, EmployeeClient employeeClient) {
//        this.userClient = userClient;
//        this.employeeClient = employeeClient;
//    }
//
//    @GetMapping("/api/v1/users")
//    public ResponseEntity<ReponseMapper> getUsers(){
//      return ResponseEntity.ok(new ReponseMapper( userClient.getUsers(),"this info is coming from endpoint: - FeignClient","cd-99"));
//
//    }
//
//    @GetMapping("/api/v1/employee")
//    public ResponseEntity<ReponseMapper> getEmployee(@RequestHeader("app-id") String appId,@RequestHeader("limit") Integer limits){
//        return ResponseEntity.ok(new ReponseMapper(employeeClient.GetEmployee(appId,limits),
//                "this info is coming from endpoint: - FeignClient", employeeClient.getClass().getName()));
//    }
//}
