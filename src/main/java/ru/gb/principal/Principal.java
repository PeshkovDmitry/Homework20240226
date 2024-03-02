package ru.gb.principal;

import lombok.AllArgsConstructor;
import ru.gb.game.Game;

@AllArgsConstructor
public class Principal implements PrincipalBehavior {

    private Integer prizeDoor;

    @Override
    public Integer openDoor(Integer playerSelectedDoor) {
        for (int i = 0; i < Game.NUMBER_OF_DOORS; i++) {
            if ((i != prizeDoor) && (i != playerSelectedDoor)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer getPrizeDoor() {
        return prizeDoor;
    }
    
}
