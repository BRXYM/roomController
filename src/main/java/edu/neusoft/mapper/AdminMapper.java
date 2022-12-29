package edu.neusoft.mapper;

import edu.neusoft.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    Admin loginAdmin(int User_id);
    int Adminupdate(Admin admin);

}
