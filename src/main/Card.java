package main;
//一张扑克牌
public class Card implements Comparable<Card>{
    private CardType cardType;
    private CardNum cardNum;

    public Card(CardType cardType,CardNum cardNum){
        this.cardType=cardType;
        this.cardNum=cardNum;

    }

    public CardType getCardType(){
        return cardType;
    }

    public int getCardNumber(){
        return this.cardNum.getNum();
    }

    public void setCardType(CardType cardType){
        this.cardType=cardType;
    }

    public CardNum getNum(){
        return cardNum;
    }

    public void setCardNum(CardNum cardNum){
        this.cardNum=cardNum;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Card card = (Card) object;

        if (this.cardType.getType() != card.cardType.getType()) {
            return false;
        }
        return this.cardNum.getNum() == card.cardNum.getNum();

    }

    @Override
    public int hashCode() {
        return this.cardType.ordinal() + this.cardNum.getNum();
    }

    @Override
    public String toString() {
        return this.cardType.getType() + this.cardNum.getNum();
    }

    /*实现Comparable接口, 获取最大的单牌, 直接使用牌的数字大小比较即可,
    使用降序排序, 因为第一个Card极为单牌最大值*/
    public int compareTo(Card card) {
        int selfNumber = this.cardNum.getNum();
        int otherNumber = card.cardNum.getNum();

        if (selfNumber < otherNumber) {
            return 1;
        }
        if (selfNumber > otherNumber) {
            return -1;
        }
        return 0;
    }


}
