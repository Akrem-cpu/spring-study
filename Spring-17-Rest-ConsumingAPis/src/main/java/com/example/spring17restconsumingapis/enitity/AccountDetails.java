package com.example.spring17restconsumingapis.enitity;

import com.example.spring17restconsumingapis.enums.Role;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "account_details")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class AccountDetails extends BaseEnitiy{

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private Integer age;
    private String postalCode;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "accountDetails")
    @JsonBackReference
    private UserAccount userAccount;






}
