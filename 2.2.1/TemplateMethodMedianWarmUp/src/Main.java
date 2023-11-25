public class Main {
    public static void main(String[] args) {
        String[] messa = {"waterball", "is", "a", "water", "based", "attack", "waterball", "", "absersddasdf"};
        CountNumberOfWaterballs countNumberOfWaterballs = new CountNumberOfWaterballs();
        System.out.println(countNumberOfWaterballs.search(messa));

        SearchEmptyMessageIndex searchEmptyMessageIndex = new SearchEmptyMessageIndex();
        System.out.println(searchEmptyMessageIndex.search(messa));

        SearchLongestMessage searchLongestMessage = new SearchLongestMessage();
        System.out.println(searchLongestMessage.search(messa));


    }
}