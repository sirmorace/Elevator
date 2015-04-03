package com.bkl;

import java.util.HashMap;

/**
 * Created by lake on 4/3/15.
 */
public class ElevatorController {
    private HashMap<Integer, Elevator> elevatorMap = new HashMap<Integer, Elevator>();

    public ElevatorController(int numberOfElevators, int numberOfFloors){
        for(int i=1;i<=numberOfElevators;i++){
            elevatorMap.put(i, new Elevator(i, numberOfFloors));
        }
    }

    public void requestElevator(int floorRequesting){
        //determine which elevator to give the request to


    }


}
