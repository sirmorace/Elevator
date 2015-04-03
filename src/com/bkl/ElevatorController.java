package com.bkl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lake on 4/3/15.
 */
public class ElevatorController {
    private HashMap<Integer, Elevator> elevatorMap = new HashMap<Integer, Elevator>();

    public ElevatorController(int numberOfElevators, int numberOfFloors){
        for(int i=1;i<=numberOfElevators;i++){
            elevatorMap.put(i, new Elevator(this, i, numberOfFloors));
        }
    }

    public Elevator requestElevator(int floorRequesting){
        //determine which elevator to give the request to: (priority) Elevator at the floor, nearest empty or occupied passing
        int closestElevatorId = 0;
        int closestDistance = 0;

        for (Map.Entry<Integer, Elevator> e : elevatorMap.entrySet()) {
            if(e.getValue().isActive()) {
                if (e.getValue().getCurrentFloor() == floorRequesting) {
                    //Already have an elevator on the floor dispatch
                    return e.getValue();
                } else {
                    int distance = e.getValue().getDistanceFromFloor(floorRequesting);
                    if (distance < closestDistance || closestDistance == 0) {
                        closestElevatorId = e.getKey();
                        closestDistance = distance;
                    }
                }
            }
        }
        if(closestElevatorId > 0) {
            return elevatorMap.get(closestElevatorId);
        }else{
            //ERROR -> ALL ELEVATORS ARE UNAVAILABLE
            return null;
        }
    }


    //Reporting actions from elevators
    public void reportMovement(int elevatorId, int floor){

    }
    public void openedDoors(int elevatorId, int floor){

    }
    public void closedDoors(int elevatorId, int floor){

    }
    public void requiresMaintenance(int elevatorId){

    }

}
