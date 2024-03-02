package ru.gb.game;

import lombok.AllArgsConstructor;
import ru.gb.player.PlayerBehavior;
import ru.gb.principal.PrincipalBehavior;
import ru.gb.statistician.StatisticianBehavior;

@AllArgsConstructor
public class Game implements GameBehavior {

    public static final Integer NUMBER_OF_DOORS = 3;

    private Integer iterationCount;

    private PlayerBehavior player;

    private PrincipalBehavior principal;

    private StatisticianBehavior statistician;

    @Override
    public void run() {
        while (iterationCount-- > 0) {
            Integer playerSelectedDoor = player.getSelectedDoor();
            Integer principalOpenedDoor = principal.openDoor(playerSelectedDoor);
            playerSelectedDoor = player.changeSelection(principalOpenedDoor);
            statistician.addResult(playerSelectedDoor == principal.getPrizeDoor() ? 1 : 0);            
        }
    }

    @Override
    public void printResult() {
        statistician.printStatistics();
    }
    

}
