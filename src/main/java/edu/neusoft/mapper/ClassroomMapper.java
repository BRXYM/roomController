package edu.neusoft.mapper;

import edu.neusoft.domain.Classroom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassroomMapper {
    List<Classroom> getAllClassrooms();
    int addClassroom(Classroom classroom);
    int updateClassroom(Classroom classroom);
    int deleteClassroom(int classroom_id);
}
