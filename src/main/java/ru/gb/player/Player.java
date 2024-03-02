package ru.gb.player;

import java.util.Random;

import ru.gb.game.Game;

public class Player implements PlayerBehavior {

    private Integer selectedDoor;

    @Override
    public Integer selectDoor() {
        selectedDoor = new Random().nextInt(Game.NUMBER_OF_DOORS);
        return selectedDoor;
    }

    @Override
    public Integer changeSelection(Integer openedByPrincipalDoor) {
        for (int i = 0; i < Game.NUMBER_OF_DOORS; i++) {
            if ((i != selectedDoor) && (i != openedByPrincipalDoor)) {
                selectedDoor = i;
            }
        }
        return selectedDoor;
    }

    @Override
    public Integer getSelectedDoor() {
        return selectedDoor;
    }
    
}
