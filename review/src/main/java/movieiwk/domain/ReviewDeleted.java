package movieiwk.domain;

import movieiwk.domain.*;
import movieiwk.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ReviewDeleted extends AbstractEvent {

    private Long reviewId;
    private Long movieId;
    private String content;

    public ReviewDeleted(Review aggregate){
        super(aggregate);
    }
    public ReviewDeleted(){
        super();
    }
}
