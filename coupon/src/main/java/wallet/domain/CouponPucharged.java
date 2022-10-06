package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponPucharged extends AbstractEvent {

    private Long id;
    private Long price;
    private String type;
    private String name;
    private String buyer;

    public CouponPucharged(Coupon aggregate){
        super(aggregate);
    }
    public CouponPucharged(){
        super();
    }
}
