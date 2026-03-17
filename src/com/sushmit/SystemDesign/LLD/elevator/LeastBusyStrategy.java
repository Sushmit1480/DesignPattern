package com.sushmit.SystemDesign.LLD.elevator;

import java.util.List;

import com.sushmit.SystemDesign.LLD.elevator.enums.ElevatorDirection;

public class LeastBusyStrategy implements ElevatorSelectionStrategy {

    @Override
    public ElevatorController selectElevator(List<ElevatorController> controllers,
                                             int requestFloor,
                                             ElevatorDirection direction) {

        ElevatorController best = null;
        int minLoad = Integer.MAX_VALUE;

        for (ElevatorController controller : controllers) {
            int load = controller.upMinPQ.size() +
                    controller.downMaxPQ.size();

            if (load < minLoad) {
                minLoad = load;
                best = controller;
            }
        }
        return best;
    }
}
