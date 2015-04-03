package com.bkl;

/**
 * Created by lake on 4/3/15.
 */
public interface ElevatorEvent {
    public int reportMovement();
    public void openedDoors();
    public void closedDoors();
    public int requiresMaintenance();


}
