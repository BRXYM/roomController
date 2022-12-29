package edu.neusoft.service;

import edu.neusoft.domain.Admin;
import edu.neusoft.utils.AdminResult;

public interface AdminService {
    AdminResult AdminloginService(int admin_id, String admin_password);
    AdminResult AdminupdateService(Admin admin);
}
