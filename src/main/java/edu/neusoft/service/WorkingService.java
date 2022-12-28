package edu.neusoft.service;

import edu.neusoft.domain.Working;
import edu.neusoft.utils.WorkingResult;

public interface WorkingService {
    WorkingResult getAllWorking();
    WorkingResult WorkingaddService(Working working);
    WorkingResult WorkingupdateService(Working working);
    WorkingResult WorkingdeleteService(int work_id);
    WorkingResult getAllWorkingForUser(int work_user_id);
    WorkingResult getAllWorkingForWaiter(int work_waiter_id);
    WorkingResult getAllWorkingForClassroom(int work_classroom_id);
}
