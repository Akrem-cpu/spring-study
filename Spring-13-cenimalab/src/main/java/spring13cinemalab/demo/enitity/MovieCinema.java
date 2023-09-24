package spring13cinemalab.demo.enitity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class MovieCinema extends BaseEnitiy{


    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime date_time;
    @ManyToOne
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;


    @OneToMany(mappedBy = "movieCinema")
    private List<Ticket> ticketList;









}
