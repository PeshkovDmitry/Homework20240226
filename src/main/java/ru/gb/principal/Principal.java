package ru.gb.principal;

import java.util.Random;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import ru.gb.App;

@ToString
@EqualsAndHashCode
public class Principal implements PrincipalBehavior {

    private int prizeDoor;

    @Override
    public int openDoor(int playerSelectedDoor) {
        for (int i = 0; i < App.NUMBER_OF_DOORS; i++) {
            if ((i != prizeDoor) && (i != playerSelectedDoor)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int showPrizeDoor() {
        return prizeDoor;
    }

    @Override
    public void choosePrizeDoor() {
        this.prizeDoor = new Random().nextInt(App.NUMBER_OF_DOORS);
    }
    
}
