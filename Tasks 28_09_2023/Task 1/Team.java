public class Team {
    private String teamName;
    private int teamRank;
    private String playerNames;

    public Team(String tempTeamName, int tempTeamRank, String tempPlayerNames){
        teamName = tempTeamName;
        teamRank = tempTeamRank;
        playerNames = tempPlayerNames;
    }

    public void setRank(int newRank){
        teamRank = newRank;
    }


    public String toString() {
        return "This is team: " + teamName + ", Their rank is: " + teamRank + ", And their players are called: " + playerNames;
    }
}