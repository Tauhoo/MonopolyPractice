package ice;

public class Dice {
    private int faceValue = 1;

    public void roll(){
        this.faceValue = (int) (Math.ceil( Math.random() * 5 ) + 1);
    }

    public int getFaceValue(){
        return this.faceValue;
    }
}
