package ice;

import java.util.Scanner;

public class MonopolyGame {
    Map map;
    Player players[];
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();
    int round = -1;

    MonopolyGame(String playerNames[], String squares[][], int squareTarget[]){
        Square[] squareList = new Square[squares.length];

        for(int square = 0; square < squares.length; square++)
            squareList[square] = new Square(square , squares[square][0], squares[square][1]);

        for(int nextIndex = 0; nextIndex < squares.length; nextIndex++)
            squareList[nextIndex].setupNext(squareTarget[nextIndex] < 0 ? null : squareList[squareTarget[nextIndex]]);


        this.map = new Map(squareList);
        this.players = new Player[playerNames.length];

        for (int index = 0; index < playerNames.length; index++)
            this.players[index] = new Player(playerNames[index], this.dice1, this.dice2, this.map);

    }

    void start(){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();

            round++;
            Player currentPlayer = this.players[round % this.players.length ];
            System.out.println(this.round + " round : " + currentPlayer.getName());

            if (currentPlayer.roll()) {
                System.out.println(currentPlayer.getName() + " win ");
                return;
            }
        }
    }

}
