package edu.neusoft.mapper;

import edu.neusoft.domain.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    //�鿴����Ԥ��
    List<Book> getAllBook();
    //����Ԥ��
    int addBook(Book book);
    //�޸�Ԥ��
    int updateBook(Book book);
    //ɾ��Ԥ��
    int deleteBook(int book_id);
    //�û���Ԥ�����
    List<Book> getAllBookForUser(int book_user_id);
    //�˼���ҵ�Ԥ�����
    List<Book> getAllBookForClassroom(int book_classroom_id);
    //����Ա��˹���Ԥ��
    List<Book> getAllBookForWaiter(int book_waiter_id);
    //������ͨ��/δͨ����Ԥ��
    List<Book> getAllBookForAudit(int audit);
}
