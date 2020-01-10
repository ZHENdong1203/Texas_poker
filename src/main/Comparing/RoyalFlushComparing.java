package main.Comparing;

import main.Player;

//同花大顺不考虑花色，直接返回0
public class RoyalFlushComparing extends AbstractComparing{
    public int compare(Player player1,Player player2){
        return 0;
    }
}
