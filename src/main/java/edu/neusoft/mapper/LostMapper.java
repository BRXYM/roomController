package edu.neusoft.mapper;

import edu.neusoft.domain.Lost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LostMapper {
    List<Lost> getAllLost();
    int addLost(Lost lost);
    int updateLost(Lost lost);
    int deleteLost(int lost_id);
    List<Lost> getAllLostForUser(int lost_user_id);
    List<Lost> getAllLostForTime(String lost_time);
    List<Lost> getAllLostForType(int lost_type);

}
