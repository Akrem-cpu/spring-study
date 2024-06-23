package com.example.spring17restconsumingapis.enitity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Getter
@Setter
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class UserAccount extends BaseEnitiy {

    private String email;
    private String password;
    private String username;


    @OneToMany(mappedBy = "userAccount")
    private List<Ticket> ticketList;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private AccountDetails accountDetails;




}
