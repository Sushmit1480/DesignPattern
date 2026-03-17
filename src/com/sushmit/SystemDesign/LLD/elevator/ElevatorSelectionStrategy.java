package com.sushmit.SystemDesign.LLD.elevator;

import java.util.List;

import com.sushmit.SystemDesign.LLD.elevator.enums.ElevatorDirection;

public interface ElevatorSelectionStrategy {

    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}