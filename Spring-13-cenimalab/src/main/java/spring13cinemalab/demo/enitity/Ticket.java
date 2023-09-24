package spring13cinemalab.demo.enitity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Ticket extends BaseEnitiy {

      @Column(columnDefinition = "TIMESTAMP")
      private LocalDateTime date_time;
      private Integer seat_number;
      private Integer row_number;

      @ManyToOne
      private MovieCinema movieCinema;

      @ManyToOne
      private UserAccount userAccount;



}
