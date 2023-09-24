package spring13cinemalab.demo.enitity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class UserAccount extends BaseEnitiy {

    private String email;
    private String password;
    private String username;


    @OneToMany(mappedBy = "userAccount")
    private List<Ticket> ticketList;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private AccountDetails accountDetails;




}
