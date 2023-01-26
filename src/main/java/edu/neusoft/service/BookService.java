package edu.neusoft.service;

import edu.neusoft.domain.Book;
import edu.neusoft.utils.BookResult;

public interface BookService {
    BookResult getAllBook();
    BookResult BookaddService(Book book);
    BookResult BookupdateService(Book book);
    BookResult BookdeleteService(int book_id);
    BookResult getAllBookForUser(int book_user_id);
    BookResult getAllBookForClassroom(int book_classroom_id);
    BookResult getAllBookForWaiter(int book_waiter_id);
    BookResult getAllBookForAudit(Book book);

}
