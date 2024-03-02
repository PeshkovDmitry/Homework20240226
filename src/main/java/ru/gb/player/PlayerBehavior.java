package ru.gb.player;

public interface PlayerBehavior {
    
    int selectDoor();

    int changeSelection(int openedByPrincipalDoor);

    int getSelectedDoor();

}
