package wallet.domain;

import wallet.domain.CouponPucharged;
import wallet.CouponApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Coupon_table")
@Data

public class Coupon  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long price;
    
    
    
    
    
    private String type;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String buyer;

    @PostPersist
    public void onPostPersist(){


        CouponPucharged couponPucharged = new CouponPucharged(this);
        couponPucharged.publishAfterCommit();

    }

    public static CouponRepository repository(){
        CouponRepository couponRepository = CouponApplication.applicationContext.getBean(CouponRepository.class);
        return couponRepository;
    }






}
