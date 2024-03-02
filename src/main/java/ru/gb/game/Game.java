package ru.gb.game;

import lombok.AllArgsConstructor;
import ru.gb.player.PlayerBehavior;
import ru.gb.principal.PrincipalBehavior;
import ru.gb.statistician.StatisticianBehavior;

@AllArgsConstructor
public class Game implements GameBehavior {

    public static final int NUMBER_OF_DOORS = 3;

    private int iterationCount;

    private PlayerBehavior player;

    private PrincipalBehavior principal;

    private StatisticianBehavior statistician;

    @Override
    public void run() {
        while (iterationCount-- > 0) {
            principal.choosePrizeDoor();
            int playerSelectedDoor = player.selectDoor();
            int principalOpenedDoor = principal.openDoor(playerSelectedDoor);
            int playerNewSelectedDoor = player.changeSelection(principalOpenedDoor);
            int prizeDoor = principal.showPrizeDoor();
            statistician.addResult(playerNewSelectedDoor == prizeDoor ? 1 : 0);            
            // System.out.printf(
            //     "%d: игрок выбрал дверь %d, ведущий открыл дверь %d, игрок передумал и выбрал дверь %d, ведущий спрятал приз за дверью %d\n\r", 
            //     iterationCount,
            //     playerSelectedDoor,
            //     principalOpenedDoor,
            //     playerNewSelectedDoor,
            //     prizeDoor);
        }
    }

    @Override
    public void printResult() {
        statistician.printStatistics();
    }
    

}
