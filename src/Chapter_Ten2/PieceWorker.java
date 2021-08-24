package Chapter_Ten2;

public class PieceWorker extends Employee{

    private double wage;
    private int piece;

    public PieceWorker(String firstName, String lastName, String securityNumber, double wage, int piece) {
        super(firstName, lastName, securityNumber);
        this.wage = wage;
        this.piece = piece;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    @Override
    public double earnings() {
        return wage * piece;
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "piece wage", getWage(),
                "piece done", getPiece());

    }
}
