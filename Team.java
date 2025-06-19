import java.util.ArrayList;

public class Team {
    private int code;
    ArrayList<Player> players = new ArrayList<Player>();
    
    public void addPlayer(Player player){

        players.add(player);
    }
}
