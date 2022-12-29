package edu.neusoft.controller;

import edu.neusoft.domain.Book;
import edu.neusoft.service.BookService;
import edu.neusoft.utils.BookResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;
    //��ȡ����Ԥ����¼
    @GetMapping("/getAllBook")
    public BookResult getAllBook(){
        return bookService.getAllBook();
    }
    //����Ԥ����Ϣ
    @GetMapping("/add")
    public BookResult addController(@RequestBody Book book){
        return bookService.BookaddService(book);
    }
    //�޸�ʹ�ü�¼
    @PutMapping("/update")
    public BookResult updateController(@RequestBody Book book){
        return bookService.BookupdateService(book);
    }
    //ɾ��Ԥ����¼
    @DeleteMapping("/delete")
    public BookResult deleteController(@RequestParam int book_id){
        return bookService.BookdeleteService(book_id);
    }
    //�����û�ID�鿴ԤԼ��¼
    @GetMapping("/getbookforuser")
    public BookResult getAllBookForUser(@RequestParam int book_user_id){
        return bookService.getAllBookForUser(book_user_id);
    }
    //���ݽ���ID��ȡԤԼ��¼
    @GetMapping("/getbookforclassroom")
    public BookResult getAllBookForClassroom(@RequestParam int book_classroom_id){
        return bookService.getAllBookForClassroom(book_classroom_id);
    }
    //���ݷ���ԱID��ȡԤԼ��¼
    @GetMapping("/getbookforwaiter")
    public BookResult getAllBookForWaiter(@RequestParam int book_waiter_id){
        return bookService.getAllBookForWaiter(book_waiter_id);
    }
    //�鿴��ͨ��/δͨ����ԤԼ��¼
    @GetMapping("/getbookforaudit")
    public BookResult getAllBookForAudit(@RequestParam int audit){
        return bookService.getAllBookForAudit(audit);
    }


}
