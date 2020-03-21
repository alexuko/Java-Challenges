package course.javaprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

public class League<T extends Team> {
    private String league_name;
    private ArrayList<Team> league = new ArrayList<>();


    public League(String league_name) {
        this.league_name = league_name;
    }

    public boolean add_team(T team){
        if(league.contains(team)){
            return false;
        }
        else {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for (Team team: league ) System.out.println(team.getTeam_name() + ": " + team.ranking());
    }
}
