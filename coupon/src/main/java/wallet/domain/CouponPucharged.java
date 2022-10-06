package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponPucharged extends AbstractEvent {

    private Long id;

    public CouponPucharged(Coupon aggregate){
        super(aggregate);
    }
    public CouponPucharged(){
        super();
    }
}
