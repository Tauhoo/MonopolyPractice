package ice;

public class Square {
    private String name;
    private String detail;
    private Square next;
    private int locationNumber;

    Square(int locationNumber, String name, String detail){
        this.name = name;
        this.detail = detail;
        this.locationNumber = locationNumber;
    }

    Boolean haveNext(){
        return next != null;
    }

    Square getNext(){
        return this.next;
    }

    void setupNext(Square next){
        this.next = next;
    }

    int getLocationNumber(){
        return this.locationNumber;
    }

    void printData(){
        System.out.println(this.name + " : " + this.detail+"\n");
    }
}
