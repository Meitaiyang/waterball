public class SearchEmptyMessageIndex extends SearchTemplate<Integer>{
    @Override
    protected Integer updateSearchResult(int index, String message) {
        return message.isEmpty() ? index : null;
    }

    @Override
    protected boolean searchEnd(int index, String message) {
        return message.isEmpty();
    }
}