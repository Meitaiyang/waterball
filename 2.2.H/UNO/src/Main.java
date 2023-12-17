public class Main {
    public static void main(String[] args) throws Exception {
        UNO uno = new UNO();
        uno.joinPlayer(new Human());
        uno.joinPlayer(new AI());
        uno.joinPlayer(new AI());
        uno.joinPlayer(new AI());
        uno.init();
        uno.takeTurn();
        uno.end();
    }
}