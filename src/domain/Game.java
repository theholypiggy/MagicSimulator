package domain;
import java.util.ArrayList;

public class Game
{
    private ArrayList<Player> players;
    private Phase             phase;
    
    public Game(int numberOfPlayers) {
        this.players = new ArrayList<Player>();
        for(int i = 0; i < numberOfPlayers; i++) {
            this.players.add(new Player());
        }
        this.phase = Phase.SELECT_DECKS;
    }
    
    public Player getPlayer(int index) {
        return players.get(index);
    }
    
    public Phase getPhase() {
        return phase;
    }
    
    public boolean isInPlay() {
        return phase == Phase.PLAY;
    }
}
