package ru.gb;

import java.util.Random;

import ru.gb.game.Game;
import ru.gb.game.GameBehavior;
import ru.gb.player.PlayerBehavior;
import ru.gb.player.Player;
import ru.gb.principal.Principal;
import ru.gb.principal.PrincipalBehavior;
import ru.gb.statistician.Statistician;
import ru.gb.statistician.StatisticianBehavior;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        PlayerBehavior player = new Player();
        PrincipalBehavior principal = new Principal(
            new Random().nextInt(Game.NUMBER_OF_DOORS)
        );
        StatisticianBehavior statistician = new Statistician();
        GameBehavior game = new Game(10000 ,player, principal, statistician);
        game.run();
        game.printResult();
    }
}
