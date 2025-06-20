import java.util.ArrayList;
import java.util.List;

public class Course {
    private int code;
    private List<Book> books;


    public Course(int code){
        this.code = code;
        this.books = new ArrayList<>();
    }
}


