package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//一副扑克牌
public class OnePoker {

    private List<Card> cards;
    private Random random;

    public OnePoker(){
        this.random=new Random();
        this.init();
    }

    public void init(){
        this.cards=new ArrayList<Card>();
        for(CardType type:CardType.values()) {
            for (CardNum num : CardNum.values()) {
                cards.add(new Card(type,num));
            }
        }
        Collections.shuffle(cards);
    }

    public int getSize(){
        return this.cards.size();
    }

    //发牌
    public Card disPatch(){
        return cards.remove(random.nextInt(cards.size()));
    }

}
