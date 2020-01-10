package main;

/*扑克的游戏规则*/
public enum RankingRule {

    HIGH_CARD("高牌",100),
    ONE_PAIR("一对",200),
    TWO_PAIR("两对",300),
    THREE_OF_A_KIND("三条",400),
    STRAIGHT("顺子",500),
    FLUSH("同花",600),
    FULL_HOUSE("满堂红",700),
    FOUR_OF_A_KIND("四条",800),
    STRAIGHT_FLUSH("同花顺",900),
    ROYAL_FLUSH("同花大顺",1000);


    private String name;
    private int priority;

    RankingRule(String  name,int priority){
        this.name=name;
        this.priority=priority;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getPriority(){
        return priority;
    }

    public void setPriority(int priority){
        this.priority=priority;
    }


}
