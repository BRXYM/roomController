package edu.neusoft.service;

import edu.neusoft.domain.Classroom;
import edu.neusoft.utils.ClassroomResult;

public interface ClassroomService {
    ClassroomResult getAllClassrooms();
    ClassroomResult ClassroomaddService(Classroom classroom);
    ClassroomResult ClassroomupdateService(Classroom classroom);
    ClassroomResult ClassroomdeleteService(int classroom_id);
}
