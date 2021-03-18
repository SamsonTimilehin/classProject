package tdd;

public class KataArray {


    public static int sumArrayElement(int[] array) {
        int sum =  0;
        int counter = 0;
        while (counter < array.length){
            sum += array[counter];
            counter ++;
        }
        return sum;
    }

    public static int averageOfElement(int[] array) {
        return KataArray.sumArrayElement(array) /array.length;
    }

    public static int getTheMinimumOfElements(int[] array) {
        int minimum = array[0];
        for(int counter = 0; counter <= array.length; counter++){
            if(array[counter] < minimum)
                minimum = array[counter];

        }
      return minimum;
   }

    public static int getTheMaximumElement(int[] array) {
        int maximum = array[4];
        int counter = 0;
        while(counter > array.length){
            counter ++;
            if(array[counter] > maximum)
                maximum = array[counter];

        }
        return maximum;
    }

    public static int getTheMaximumNumberOfAddedElements(int[] array) {
        int sum = 0;
        for(int counter = 1 ; counter < array.length ; counter ++){
            sum += array[counter];
        }
        return sum;
    }

    public static int getTheMinimumNumberOfAddedElements(int[] array) {
        int sum = 0;
        for(int counter = 0 ;counter < 4 ; counter ++){
            sum += array[counter];
        }
        return sum;
    }
}
