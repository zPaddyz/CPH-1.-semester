public class Main {
    public static void main(String[] args) {
        Team newTeam = new Team("Hold A", 1, "Bjarne, Birger, Bøgild");
        newTeam.setRank(2);
        Team newTeam2 = new Team("Hold B", 1, "Bjarne, Birger, Bøgild");
        Team newTeam3 = new Team("Hold C", 3, "Bjarne, Birger, Bøgild");
        Team newTeam4 = new Team("Hold D", 4, "Bjarne, Birger, Bøgild");
        Team newTeam5 = new Team("Hold E", 5, "Bjarne, Birger, Bøgild");
        System.out.println(newTeam);
        System.out.println(newTeam2);
        System.out.println(newTeam3);
        System.out.println(newTeam4);
        System.out.println(newTeam5);

    }
}
