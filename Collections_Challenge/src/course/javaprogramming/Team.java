package course.javaprogramming;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String team_name;
    private int played;
    private int won;
    private int lost;
    private int drawn;

    //store members of the team
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.team_name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.drawn = 0;
    }

    public String getTeam_name() {
        return team_name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("player already exists");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + team_name);
            return true;
        }

    }

    public int get_numberOfPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if (ourScore > theirScore){
            message = " beat ";
            won++;
        }else if (ourScore < theirScore){
            message = " lost VS ";
            lost++;
        }else{
            message = " drew with ";
            drawn++;
        }
        //results for the opponent
        if(opponent != null){
            System.out.println(this.getTeam_name() + message + opponent.getTeam_name());
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + drawn;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;
        }

    }
}
