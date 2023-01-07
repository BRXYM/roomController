package edu.neusoft.service;

import edu.neusoft.domain.Waiter;
import edu.neusoft.utils.WaiterResult;

public interface WaiterService {
    WaiterResult getAllWaiters();
    WaiterResult userGetAllWaiter();
    WaiterResult WaiterloginService(int waiter_id, String password);
    WaiterResult WaiteraddService(Waiter waiter);
    WaiterResult WaiterupdateService(Waiter waiter);
    WaiterResult WaiterdeleteService(int waiter_id);


}
