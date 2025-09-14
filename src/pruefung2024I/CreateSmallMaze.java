package pruefung2024I;

public class CreateSmallMaze {

    public Room createSmallMaze(){
        Room a1 = new Room("a1");
        Room a2 = new Room("a2");
        Room b2 = new Room("b2");
        Room b1 = new Room("b1");

        b1.setMinotaur(true);

        a1.addReachable(a2);
        a2.addReachable(a1);
        a2.addReachable(b2);
        b2.addReachable(a2);
        b2.addReachable(b1);
        b1.addReachable(b2);

        return a1;
    }
}
