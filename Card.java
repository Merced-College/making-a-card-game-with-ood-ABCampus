public class Card {
    private int value;
    private String suit;
    private String rank;
  //constructor
    public Card(int value, String suit, String rank) {
      this.value = value;
      this.suit = suit;
      this.rank = rank;
    }
  //accessors
    public int getValue() {
      return value;
    }
  
    public String getSuit() {
      return suit;
    }
  
    public String getRank() {
      return rank;
    }
//mutators (not really sure why they are required but I'll add them anyway)
    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
//tostring to print the card relevant card details
    public String toString() {
      return rank + " of " + suit;
    }
    
}
