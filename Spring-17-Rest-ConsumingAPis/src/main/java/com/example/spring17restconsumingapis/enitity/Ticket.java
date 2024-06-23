package com.example.spring17restconsumingapis.enitity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Ticket extends BaseEnitiy {

      @Column(columnDefinition = "TIMESTAMP")
      private LocalDateTime date_time;
      private Integer seat_number;
      private Integer row_number;

      @ManyToOne(fetch = FetchType.LAZY)
      private MovieCinema movieCinema;

      @ManyToOne
      private UserAccount userAccount;



}
