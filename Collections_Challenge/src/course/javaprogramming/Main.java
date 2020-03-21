package course.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        League<Team<FootBallPlayer>> footballLeague = new League<>("AFL");
        Team<FootBallPlayer> chivas = new Team<>("Chivas");
        Team<FootBallPlayer> america = new Team<>("America");
        Team<FootBallPlayer> pumas = new Team<>("Pumas");

        Team<BasquetballPlayer> bulls = new Team<>("Bulls");

        footballLeague.add_team(chivas);
        footballLeague.add_team(america);
        footballLeague.add_team(pumas);


        chivas.matchResult(america,4,0);
        chivas.matchResult(pumas,1,2);
        pumas.matchResult(america,1,2);
        pumas.matchResult(chivas,1,7);

        footballLeague.showLeagueTable();



    }
}
