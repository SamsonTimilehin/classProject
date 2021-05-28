package chapterFive;



public class CalculatePi {

    public static void main(String[] args) {
        CalculatePi piiValue = new CalculatePi();
        piiValue.calculatePiSeries();
    }

    public void calculatePiSeries(){
        double pii = 4;
        for(int d =1; d<= 200; d++){
            if(pii == 3.14159){
                break;
            }
            pii = pii + Math.pow(-1, d) * 4/ ((d * 2) + 1);
            System.out.printf("%d\t%f%n",d, pii);
        }
    }
}
