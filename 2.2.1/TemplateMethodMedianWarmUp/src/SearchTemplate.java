public abstract class SearchTemplate <Result>{
    public Result search(String[] messages) {
        Result result = init();
        for( int index = 0 ; index < messages.length ; index ++) {
            result = updateSearchResult(index, messages[index]);
            // System.out.println(messages[index]);
            if (searchEnd(index, messages[index])) {
                break;
            }
        }
        return result;
    }

    protected Result init() {
        return null;
    }

    protected boolean searchEnd (int index, String message) {
        return false;
    }

    protected abstract Result updateSearchResult(int index, String message);


}
