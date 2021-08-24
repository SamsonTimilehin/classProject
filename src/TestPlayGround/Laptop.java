package TestPlayGround;

public class Laptop {

    private String laptopOwner;
    private int laptopNumber;
    private static int counterTotalNumberOfLaptops;

    public Laptop(String laptopOwner){
        this.laptopOwner = laptopOwner;
        laptopNumber = ++counterTotalNumberOfLaptops;
    }
    public String getLaptopOwner() {
        return laptopOwner;
    }
    public void setLaptopOwner(String laptopOwner) {
        this.laptopOwner = laptopOwner;
    }

    public int getLaptopNumber() {
        return laptopNumber;
    }

    public void setLaptopNumber(int laptopNumber) {
        this.laptopNumber = laptopNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\t%s",laptopOwner,laptopNumber);
    }
}
