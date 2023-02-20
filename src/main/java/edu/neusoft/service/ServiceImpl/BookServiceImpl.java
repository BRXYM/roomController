package edu.neusoft.service.ServiceImpl;

import cn.hutool.core.date.DateTime;
import edu.neusoft.domain.Book;
import edu.neusoft.domain.Working;
import edu.neusoft.mapper.BookMapper;
import edu.neusoft.mapper.WorkingMapper;
import edu.neusoft.service.BookService;
import edu.neusoft.utils.BookResult;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@EnableScheduling
@Component
@Service
public class BookServiceImpl implements BookService {
    String time;
    @Resource
    private BookMapper bookMapper;
    @Resource
    private WorkingMapper workingMapper;
    @Override
    public BookResult getAllBook() {
        List<Book> list = bookMapper.getAllBook();
        System.out.println("获取所有预订信息");
        return new BookResult(500,"001",list,"获取成功");
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    public void BookToWorking(){
        System.out.println("刷新使用数据");
        List<Book> book_list = bookMapper.getAllBook();
        //定义所需数据
        Date now_time = DateTime.now();
        Date start_time;
        Working work_time = new Working();
        System.out.println(now_time);
        //循环遍历book
        for (Book book:book_list){
            start_time = book.getBook_start_time();
//            判定是否超过当前时间
            if (start_time.before(now_time)){
                //判定是否通过审核
                if (Objects.equals(book.getAudit(), "通过")){
                    //实体类赋值
                    work_time.setWork_id(0);
                    work_time.setWork_user_id(book.getBook_user_id());
                    work_time.setWork_classroom_id(book.getBook_classroom_id());
                    work_time.setWork_waiter_id(book.getBook_waiter_id());
                    work_time.setWork_start_time(book.getBook_start_time());
                    work_time.setWork_end_time(book.getBook_end_time());
                    work_time.setWork_classroom_remark(null);
                    System.out.println(book.getBook_id()+"晚于当前时间");
                    //添加使用记录
                    workingMapper.addWorking(work_time);
                    //删除预定记录
                    bookMapper.deleteBook(book.getBook_id());
                }
            }
        }
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
    public BookResult getAllBookForAudit(Book book) {
        List<Book> list = bookMapper.getAllBookForAudit(book);
        return new BookResult(200,"001",list,"获取成功");
    }

}
