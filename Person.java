import java.util.ArrayList;
public class Person {
    private String name;
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<Watch> watches = new ArrayList<Watch>();

    public void addWatch(Watch watch){
        watches.add(watch);
    }
    public ArrayList<Movie> getMovies(){
        return movies;
    }

public class Movie{
    private String name;
    private String genre;
    ArrayList<Person> persons = new ArrayList<Person>();
    ArrayList<Watch> watches = new ArrayList<Watch>();

    public void addWatch(Watch watch){
        watches.add(watch);
    }
    public ArrayList<Person> getPersons(){
        return persons;
    }
}

public class Watch{
    private int rating;
    
    public Watch(int rating){
        this.rating = rating;
    }
}
    
}
