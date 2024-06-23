package com.example.spring17restconsumingapis.enitity;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity

@Getter
@Setter
@NoArgsConstructor
public class MovieCinema extends BaseEnitiy{


    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime date_time;
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;












}
