
public abstract class Ship {
    private String name;
    private int length;
    private char identifier;
    private int xCoord;
    private int yCoord;


    public Ship(String name, int length, char identifier){
        this.name = name;
        this.length = length;
        this.identifier = identifier;
    }

    public Ship(String name, int length, char identifier, int xCoord, int yCoord){
        this.name = name;
        this.length = length;
        this.identifier = identifier;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
    
    public void setIdentifier(char identifier) {
        this.identifier = identifier;
    }

    public char getIdentifier() {
        return identifier;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getyCoord() {
        return yCoord;
    }
}
