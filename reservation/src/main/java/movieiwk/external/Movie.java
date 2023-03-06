package movieiwk.external;

import lombok.Data;
import java.util.Date;
@Data
public class Movie {

    private Long movieId;
    private String status;
    private String desc;
    private Long reviewCnt;
    private String lastAction;
    private Integer numberOfSeats;
    private Long customerId;
    private Date startDate;
    private Date endDate;
}


