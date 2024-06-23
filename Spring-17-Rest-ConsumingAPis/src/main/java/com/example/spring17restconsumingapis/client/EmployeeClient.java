//package com.example.spring17restconsumingapis.client;
//
//import com.example.spring17restconsumingapis.dto.Employee;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//
//@FeignClient(url = "https://dummyapi.io", name = "EMPLOYEE-CLIENT")
//public interface EmployeeClient {
//
//    @GetMapping("/data/v1/user")
//    public Employee GetEmployee(@RequestHeader("app-id") String appCode, @RequestHeader("limit") Integer limit);
//
//
//}
