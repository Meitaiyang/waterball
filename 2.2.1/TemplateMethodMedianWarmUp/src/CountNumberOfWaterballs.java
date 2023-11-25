public class CountNumberOfWaterballs extends SearchTemplate<Integer>{
    private int numberOfWaterballs = 0;

    @Override
    protected Integer init() {
        return 0;
    }

    @Override
    protected Integer updateSearchResult(int index, String message) {
        if (message.equals("waterball")) {
            numberOfWaterballs ++;
        }
        return numberOfWaterballs;
    }

}