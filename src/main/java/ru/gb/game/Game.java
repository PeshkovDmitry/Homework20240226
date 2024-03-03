package ru.gb.game;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.gb.player.PlayerBehavior;
import ru.gb.principal.PrincipalBehavior;
import ru.gb.statistician.StatisticianBehavior;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Game implements GameBehavior {

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
        }
    }

    @Override
    public void printResult() {
        statistician.printStatistics();
    }
    

}
