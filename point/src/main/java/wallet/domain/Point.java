package wallet.domain;

import wallet.domain.PointsReduced;
import wallet.PointApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Point_table")
@Data

public class Point  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String holder;
    
    
    
    
    
    private Long amount;

    @PostPersist
    public void onPostPersist(){


        PointsReduced pointsReduced = new PointsReduced(this);
        pointsReduced.publishAfterCommit();

    }

    public static PointRepository repository(){
        PointRepository pointRepository = PointApplication.applicationContext.getBean(PointRepository.class);
        return pointRepository;
    }




    public static void usePoint(CouponPucharged couponPucharged){

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointsReduced pointsReduced = new PointsReduced(point);
        pointsReduced.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(couponPucharged.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointsReduced pointsReduced = new PointsReduced(point);
            pointsReduced.publishAfterCommit();

         });
        */

        
    }


}
