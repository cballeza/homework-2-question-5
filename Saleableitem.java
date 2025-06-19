public interface Saleableitem {
    public void sellCopy();

public class Magazine implements Saleableitem{
    public void sellCopy(){
        System.out.println("Selling a magazine here");
    }
}
public class Ticket implements Saleableitem{
    public void sellCopy(){
        System.out.println("Selling a ticket here");
    }
}

}
