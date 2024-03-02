package ru.gb.player;

public interface PlayerBehavior {
    
    Integer selectDoor();

    Integer changeSelection(Integer openedByPrincipalDoor);

    Integer getSelectedDoor();

}
