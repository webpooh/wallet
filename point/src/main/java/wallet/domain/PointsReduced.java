package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PointsReduced extends AbstractEvent {

    private Long id;

    public PointsReduced(Point aggregate){
        super(aggregate);
    }
    public PointsReduced(){
        super();
    }
}
