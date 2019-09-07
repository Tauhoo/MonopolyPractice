package ice;

public class Map {
    private Square squares[];

    Map(Square squares[]){
        this.squares = squares;
    }

    int getSquareLength(){
        return this.squares.length;
    }

    Square getSquare(int locationNumber){
        return squares[locationNumber];
    }
}
