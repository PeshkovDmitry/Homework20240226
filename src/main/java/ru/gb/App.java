package ru.gb;

import ru.gb.game.Game;
import ru.gb.game.GameBehavior;
import ru.gb.player.PlayerBehavior;
import ru.gb.player.Player;
import ru.gb.principal.Principal;
import ru.gb.principal.PrincipalBehavior;
import ru.gb.statistician.Statistician;
import ru.gb.statistician.StatisticianBehavior;

public class App 
{

    public static final int COUNT_OF_ITERATIONS = 1000;

    public static final int NUMBER_OF_DOORS = 3;

    public static void main( String[] args )
    {
        PlayerBehavior player = new Player();
        PrincipalBehavior principal = new Principal();
        StatisticianBehavior statistician = new Statistician();
        GameBehavior game = new Game(COUNT_OF_ITERATIONS ,player, principal, statistician);
        game.run();
        game.printResult(); // Проведено 1000 игр, из них выиграно 664. Процент выигрыша - 0,664000
    }
}
