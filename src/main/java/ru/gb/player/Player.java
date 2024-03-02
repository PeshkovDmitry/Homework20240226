package ru.gb.player;

import java.util.Random;

import lombok.ToString;
import ru.gb.game.Game;

@ToString
public class Player implements PlayerBehavior {

    private int selectedDoor;

    @Override
    public int selectDoor() {
        selectedDoor = new Random().nextInt(Game.NUMBER_OF_DOORS);
        return selectedDoor;
    }

    @Override
    public int changeSelection(int openedByPrincipalDoor) {
        boolean finding = true;
        for (int i = 0; i < Game.NUMBER_OF_DOORS && finding; i++) {
            if ((i != openedByPrincipalDoor) && ( i != selectedDoor)) {
                selectedDoor = i;
                finding = false;    
            }
        }
        return selectedDoor;
    }

    @Override
    public int getSelectedDoor() {
        return selectedDoor;
    }
    
}
