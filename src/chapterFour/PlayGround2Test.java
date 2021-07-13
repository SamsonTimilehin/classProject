package chapterFour;


import java.util.Arrays;

public class PlayGround2Test {

    public static void main(String[] args) {

//        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
//
//        String[] removeColors = {"RED", "WHITE", "BLUE"};
//
//        List<String> list = new ArrayList<>();
//
//            for(String color : colors){
//                list.add(color);
//
//            }
//            List<String> removeList = new ArrayList<>();
//            for(String removeColor : removeColors){
//                removeList.add(removeColor);
//            }
//        removeDuplicate(list,removeList);
//            for(String color : list){
//                System.out.println(color);
//            }
//        System.out.println();
//      }
//      public static void removeDuplicate(Collection<String> collection1, Collection<String> collection2){
//        Iterator<String> iterator = collection1.iterator();
//        while(iterator.hasNext()){
//            if(collection2.contains(iterator.next())){
//                iterator.remove();
//            }
//        }

//        String [] test = {"1,4,6,8", "2,4,8,9"};
//        for(int i = 0; i < test.length; i++){
//            System.out.println(test[i]);
//
        //  ----------------------------------------------------------------------------------------------------
//        int [] testArray = {2,3,4,1};
//        System.out.println(Arrays.toString(displayProductOfArray(testArray)));
//    }
//    public static int[] displayProductOfArray(int[] arrayItem){
//        int[] newArray = new int[arrayItem.length];
//        int product = 1;
//        for (int i = 0; i < arrayItem.length; i++) {
//            product *= arrayItem[i];
//        }
//
//        for (int i = 0; i < arrayItem.length; i++) {
//            newArray[i] = product / arrayItem[i];
//        }
//        return newArray;
        System.out.println(Arrays.toString(shuffleByNumber(new int[]{8,5,3}, -5)));

    }
    public static int[] shuffleByNumber(int[] arrayElements, int number) {
        int counter = 0;
        int counter2 = 0;
        int store;
        int store2;

    for(int i = 0; i < arrayElements.length; i++){
        number%= arrayElements.length;
        counter++;
        if(counter <= number && counter > 0){
            for(int j = 0, y = arrayElements.length - 1; j < arrayElements.length; j++) {
                store = arrayElements[j];
                arrayElements[j] = arrayElements[y];
                arrayElements[y] = store;
            }
        }
    }
    for(int k = 0; k < arrayElements.length; k++){
        number%= arrayElements.length;
        counter2--;
        if(counter2 >= number){
            for(int j = 0, y = j + 1; j < arrayElements.length-1; j++, y++) {
                store2 = arrayElements[j];
                arrayElements[j] = arrayElements[y];
                arrayElements[y] = store2;
            }
            }

    }
        return arrayElements;
    }
}



