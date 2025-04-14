import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Room[] roomArray = {
            new Room(0, 3),
            new Room(1, 8),
            new Room(2, 5),
            new Room(3, 8),
            new Room(4, 1)
        };
        
        ArrayList<Integer> visitedRooms = new ArrayList<Integer>();
        visitedRooms.add(2);
        visitedRooms.add(3);
        visitedRooms.add(1);

        WumpusTracker nini = new WumpusTracker(roomArray, visitedRooms);

        System.out.println(nini.getAverageDanger());
        System.out.println(nini.getMostDangerousVisitedRoom());


    }
}
