package Chapter_Seven;

import java.security.SecureRandom;

public class ShuffleArray {
    private final SecureRandom secureRandom = new SecureRandom();
    private int[] items;

    public void displayArray(int[]items){
        int store1;
        int store2;
        for(int i = 0; i< items.length; i++){
            store1 = secureRandom.nextInt(items.length);
            store2 = items[i];
            items[i] = items[store1];
            items[store1] = store2;
            this.items = items;
        }
    }

    public int[] getDisplayArray() {
        return items;
    }
}
