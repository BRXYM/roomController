package edu.neusoft.mapper;

import edu.neusoft.domain.Waiter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface WaiterMapper {
    List<Waiter> getAllWaiters();
    List<Waiter> userGetAllWaiters();
    Waiter loginWaiter(int waiter_id);

    int addWaiter(Waiter waiter);

    int updateWaiter(Waiter waiter);

    int deleteWaiter(int waiter_id);


}
