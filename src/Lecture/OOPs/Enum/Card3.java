package Lecture.OOPs.Enum;

public class Card3 {
    private final Rank rank;
    private final Suit suit;

    public Card3(Rank rank,Suit suit){
        this.rank=rank;
        this.suit=suit;
    }

    public Rank getRank() {
        return rank;
    }
    public Suit getSuit(){
        return suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}
