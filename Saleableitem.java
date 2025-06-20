public interface Saleableitem {
    public void sellCopy();

public class Magazine implements Saleableitem{
    public Magazine(){

    }
    public void sellCopy(){
        System.out.println("Selling a magazine here");
    }
}
public class Ticket implements Saleableitem{
    public Ticket(){
        
    }
    public void sellCopy(){
        System.out.println("Selling a ticket here");
    }
}

}
