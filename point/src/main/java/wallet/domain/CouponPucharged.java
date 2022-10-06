package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CouponPucharged extends AbstractEvent {

    private Long id;
    private Long price;
    private String type;
    private String name;
    private String buyer;
}


