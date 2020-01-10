package main;

//牌的花色
public enum CardType {

    RED_PEACH("A"),
    SQUARE("B"),
    BLACK_PEACH("C"),
    FLOWER("D");

    private String type;
    CardType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }
}
