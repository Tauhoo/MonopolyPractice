package ice;

public class main {
    public static void main(String arg[]){
        String [] players = { "ice", "boy", "zeya", "peach", "bun", "mint", "smart"};
        String [][] squares = {
                {"home","start"},
                {"bus stop","bus don't come"},
                {"lotus","the super market"},
                {"fasion","lost money"},
                {"school", "go to university"},
                {"karsetsart","the university"}
        };
        int[] nextStep = {-1, 0, -1, 0, 5, -1};

        MonopolyGame game = new MonopolyGame(players,squares, nextStep);
        game.start();
    }
}
