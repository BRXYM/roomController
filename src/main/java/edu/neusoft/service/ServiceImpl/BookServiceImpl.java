package edu.neusoft.service.ServiceImpl;

import edu.neusoft.domain.Book;
import edu.neusoft.mapper.BookMapper;
import edu.neusoft.service.BookService;
import edu.neusoft.utils.BookResult;
import edu.neusoft.utils.WorkingResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public BookResult getAllBook() {
        List<Book> list = bookMapper.getAllBook();
        System.out.println("获取所有预订信息");
        return new BookResult(500,"001",list,"获取成功");
    }

    @Override
    public BookResult BookaddService(Book book) {
        int line = 0;
        try{
            line = bookMapper.addBook(book);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("编号重复");
        }
        if(line > 0){
            System.out.println("新增记录"+book.getBook_id());
            return new BookResult(200,"001",book,"预定成功");
        }
        return new BookResult(500,"002","预定失败");
    }

    @Override
    public BookResult BookupdateService(Book book) {
        int line = bookMapper.updateBook(book);
        if (line > 0){
            System.out.println("修改成功");
            return new BookResult(200,"001",book,"修改成功");
        }
        System.out.println("教室不存在");
        return new BookResult(500,"002","修改失败");


    }

    @Override
    public BookResult BookdeleteService(int book_id) {
        int line = bookMapper.deleteBook(book_id);
        if (line>0){
            System.out.println(book_id+"已删除");
            return new BookResult(200,"001","删除成功");
        }
        System.out.println("没有此预约");
        return new BookResult(500,"002","删除失败");
    }

    @Override
    public BookResult getAllBookForUser(int book_user_id) {
        List<Book> list = bookMapper.getAllBookForUser(book_user_id);
        return new BookResult(200,"001",list,"获取成功");
    }

    @Override
    public BookResult getAllBookForClassroom(int book_classroom_id) {
        List<Book> list = bookMapper.getAllBookForClassroom(book_classroom_id);
        return new BookResult(200,"001",list,"获取成功");
    }

    @Override
    public BookResult getAllBookForWaiter(int book_waiter_id) {
        List<Book> list = bookMapper.getAllBookForWaiter(book_waiter_id);
        return new BookResult(200,"001",list,"获取成功");
    }

    @Override
    public BookResult getAllBookForAudit(int audit) {
        List<Book> list = bookMapper.getAllBookForAudit(audit);
        return new BookResult(200,"001",list,"获取成功");
    }

}
