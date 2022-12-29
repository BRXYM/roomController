package edu.neusoft.service;

import edu.neusoft.domain.Lost;
import edu.neusoft.utils.LostResult;

public interface LostService {
    LostResult getAllLost();
    LostResult LostaddService(Lost lost);
    LostResult Lostupdate(Lost lost);
    LostResult Lostdelete(int lost_id);
    LostResult getAllLostForUser(int lost_user_id);

}
