package ru.gb.player;

import java.util.Random;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.gb.App;

@ToString
@EqualsAndHashCode
public class Player implements PlayerBehavior {

    private int selectedDoor;

    @Override
    public int selectDoor() {
        selectedDoor = new Random().nextInt(App.NUMBER_OF_DOORS);
        return selectedDoor;
    }

    @Override
    public int changeSelection(int openedByPrincipalDoor) {
        boolean finding = true;
        for (int i = 0; i < App.NUMBER_OF_DOORS && finding; i++) {
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
