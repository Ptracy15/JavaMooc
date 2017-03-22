
import java.util.ArrayList;


public class Team {

    // variables
    private String name;
    private ArrayList<Player> roster = new ArrayList<Player>();
    private int maxSize = 16;

    //constructor
    public Team(String name) {
        this.name = name;
        this.roster = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public void addPlayer(Player player){
        if(roster.size()<this.maxSize){
            roster.add(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return roster.size();
    }
    
    public int goals(){
        int teamGoals = 0;
        for(Player player:roster){
             teamGoals += player.goals();
        }
        return teamGoals;
    }
    
    public void printPlayers(){
        for(Player player:roster){
            System.out.println(player);
        }
    }

    //method to get team name
    public String getName() {
        return this.name;
    }

}
