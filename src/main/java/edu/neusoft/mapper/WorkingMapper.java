package edu.neusoft.mapper;

import edu.neusoft.domain.Working;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkingMapper {
    List<Working> getAllWorking();
    int addWorking(Working working);
    int updateWorking(Working working);
    int deleteWorking(int work_id);
    List<Working> getAllWorkingForUser(int work_user_id);
    List<Working> getAllWorkingForWaiter(int work_waiter_id);
    List<Working> getAllWorkingForClassroom(int work_classroom_id);
}
