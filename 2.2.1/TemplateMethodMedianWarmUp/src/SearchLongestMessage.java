public class SearchLongestMessage extends SearchTemplate<String>{
    private String longestMessage = "";

    @Override
    protected String updateSearchResult(int index, String message) {
        longestMessage = message.length() > longestMessage.length() ? message : longestMessage;
        return longestMessage;
    }
}