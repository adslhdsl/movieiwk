package movieiwk.domain;

import movieiwk.domain.*;
import movieiwk.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ReservationCreated extends AbstractEvent {

    private Long rsvId;
    private Long movieId;
    private String status;
    private Long payId;

    public ReservationCreated(Reservation aggregate){
        super(aggregate);
    }
    public ReservationCreated(){
        super();
    }
}
