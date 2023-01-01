package edu.neusoft.mapper;

import edu.neusoft.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    //查看所有预定
    List<Book> getAllBook();
    //增加预定
    int addBook(Book book);
    //修改预定
    int updateBook(Book book);
    //删除预定
    int deleteBook(int book_id);
    //用户的预定情况
    List<Book> getAllBookForUser(int book_user_id);
    //此间教室的预定情况
    List<Book> getAllBookForClassroom(int book_classroom_id);
    //服务员审核过的预定
    List<Book> getAllBookForWaiter(int book_waiter_id);
    //查找已通过/未通过的预定
    List<Book> getAllBookForAudit(int audit);
}
