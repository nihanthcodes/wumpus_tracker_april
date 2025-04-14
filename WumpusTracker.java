import java.util.ArrayList;

import java.util.ArrayList;

public class WumpusTracker {
    private Room[] roomArray;
    private ArrayList<Integer> visitedRooms;

    public WumpusTracker(Room[] rooms, ArrayList<Integer> visits) {
        roomArray = rooms;
        visitedRooms = visits;
    }

    /** Returns the average danger level of all visited rooms */
    public double getAverageDanger() {
        int total = 0;
        for (int visit=0; visit<visitedRooms.size(); visit++){
            for (int roomNo=0; roomNo<roomArray.length; roomNo++){
                if (visitedRooms.get(visit) == roomArray[roomNo].getID()){
                    total+=roomArray[roomNo].getDangerLevel();
                }
            }
        }

        return total/visitedRooms.size();
    }

    /** Returns the ID of the most dangerous room the player has visited */
    public int getMostDangerousVisitedRoom() {
        int max = 0;
        int maxID = 0;
        for (int visit=0; visit<visitedRooms.size(); visit++){
            for (int roomNo=0; roomNo<roomArray.length; roomNo++){
                if (visitedRooms.get(visit) == roomArray[roomNo].getID()){
                    if (roomArray[roomNo].getDangerLevel()>max){
                        max = roomArray[roomNo].getDangerLevel();
                        maxID = roomArray[roomNo].getID();
                    }
                }
            }
        }
        return maxID;
    }
}