package springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Levi
 * @Classname PaymentDao
 * @Description
 * @Date 2021/2/2 15:41
 */
@Mapper
public interface PaymentDao {
    /**
     * 添加数据
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
