package edu.neusoft.service;

import edu.neusoft.domain.Lost;
import edu.neusoft.utils.LostResult;

public interface LostService {
    LostResult getAllLost();
    LostResult LostaddService(Lost lost);
    LostResult LostupdateService(Lost lost);
    LostResult LostdeleteService(int lost_id);
    LostResult getAllLostForUser(int lost_user_id);
    LostResult getAllLostForTime(String lost_time);
    LostResult getAllLostForType(int lost_type);

}
