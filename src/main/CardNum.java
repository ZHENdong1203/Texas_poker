package main;

//牌的数字
public enum CardNum {

    CARD_TWO(2),
    CARD_THREE(3),
    CARD_FOUR(4),
    CARD_FIVE(5),
    CARD_SIX(6),
    CARD_SEVEN(7),
    CARD_EIGHT(8),
    CARD_NINE(9),
    CARD_TEN(10),
    CARD_ELEVEN(11),
    CARD_TWELVE(12),
    CARD_THIRTEEN(13),
    CARD_ONE(1);

    private Integer num;

    CardNum(Integer num){
        this.num=num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num){
        this.num=num;
    }
}
