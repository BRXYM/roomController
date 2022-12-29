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
    //获取所有预定记录
    @GetMapping("/getAllBook")
    public BookResult getAllBook(){
        return bookService.getAllBook();
    }
    //增加预定信息
    @GetMapping("/add")
    public BookResult addController(@RequestBody Book book){
        return bookService.BookaddService(book);
    }
    //修改使用记录
    @PutMapping("/update")
    public BookResult updateController(@RequestBody Book book){
        return bookService.BookupdateService(book);
    }
    //删除预定记录
    @DeleteMapping("/delete")
    public BookResult deleteController(@RequestParam int book_id){
        return bookService.BookdeleteService(book_id);
    }
    //根据用户ID查看预约记录
    @GetMapping("/getbookforuser")
    public BookResult getAllBookForUser(@RequestParam int book_user_id){
        return bookService.getAllBookForUser(book_user_id);
    }
    //根据教室ID获取预约记录
    @GetMapping("/getbookforclassroom")
    public BookResult getAllBookForClassroom(@RequestParam int book_classroom_id){
        return bookService.getAllBookForClassroom(book_classroom_id);
    }
    //根据服务员ID获取预约记录
    @GetMapping("/getbookforwaiter")
    public BookResult getAllBookForWaiter(@RequestParam int book_waiter_id){
        return bookService.getAllBookForWaiter(book_waiter_id);
    }
    //查看已通过/未通过的预约记录
    @GetMapping("/getbookforaudit")
    public BookResult getAllBookForAudit(@RequestParam int audit){
        return bookService.getAllBookForAudit(audit);
    }


}
