package domain;
import java.util.ArrayList;

public class Game
{
    private ArrayList<Player> players;
    
    public Game(int numberOfPlayers) {
        this.players = new ArrayList<Player>();
        for(int i = 0; i < numberOfPlayers; i++) {
            this.players.add(new Player());
        }
    }
    
    public Player getPlayer(int index) {
        return players.get(index);
    }
}
