package Chapter_Seventheen;

public class StreamOfInvoice {

    private final int partNumber;
    private final String partDescription;
    private final int quantity;
    private final double price;


    public StreamOfInvoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public String getPartDescriptionAndQuantity(){
        return  partDescription + "\t" + quantity;
    }
    public double getValue(){
        return quantity * price;
    }
    public String getPartDescriptionAndValue(){
        double value = getValue();
        return partDescription + "\t" + value;
    }

    @Override
    public String toString() {
        return String.format(" %d\t%s\t%d\t%f %n", partNumber,partDescription,quantity,price);
    }
}
