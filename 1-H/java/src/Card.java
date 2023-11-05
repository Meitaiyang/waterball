public class Card {

    private final String suit;
    private final int point;

    public enum Suit {
        CLUBS("C"), 
        DIAMONDS("D"), 
        HEARTS("H"), 
        SPADES("S");

        private final String representation;

        Suit(String representation) {
            this.representation = representation;
        }

        @Override
        public String toString() {
            return representation;
        }
    }

    public enum Rank {
        R2("2"), 
        R3("3"), 
        R4("4"), 
        R5("5"), 
        R6("6"), 
        R7("7"), 
        R8("8"), 
        R9("9"), 
        R10("10"), 
        J("J"), 
        Q("Q"), 
        K("K"), 
        A("A");

        private final String representation;

        Rank(String representation) {
            this.representation = representation;
        }

        @Override
        public String toString() {
            return representation;
        }
    }

    public Card(String suit, int point) {
        this.suit = suit;
        this.point = point;
    }

    public int getCardPoint() {
        return point;
    }
    
}
