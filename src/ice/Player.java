package ice;

public class Player {
    private String name;
    private int locationNumber = 0;
    private Map map;
    private Dice dice1;
    private Dice dice2;

    Player (String name, Dice dice1, Dice dice2, Map map) {
        this.name = name;
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.map = map;
    }

    String getName(){
        return this.name;
    }

    int getLocationNumber(){
        return this.locationNumber;
    }

    private void updateLocation(){
        int diceNumber1 = this.dice1.getFaceValue();
        int diceNumber2 = this.dice2.getFaceValue();

        this.locationNumber = (diceNumber1 + diceNumber2 + this.locationNumber) % this.map.getSquareLength() ;
    }

    private Boolean activateSquare(){
        Square currentSquare = this.map.getSquare(this.locationNumber);
        currentSquare.printData();

        while(currentSquare.haveNext()){
            currentSquare = currentSquare.getNext();
            System.out.println("Go to " + currentSquare.getLocationNumber());
            this.locationNumber = currentSquare.getLocationNumber();
            currentSquare.printData();
        }

        return this.map.getSquareLength() - 1 == currentSquare.getLocationNumber();
    }

    Boolean roll(){
        this.dice1.roll();
        this.dice2.roll();
        System.out.println("Your dices face : " + this.dice1.getFaceValue() + " " + this.dice2.getFaceValue() + "\n");

        this.updateLocation();
        return this.activateSquare();
    }
}
