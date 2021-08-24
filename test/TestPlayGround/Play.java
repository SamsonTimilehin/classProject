package TestPlayGround;

import chapterFour.EnumPlayGround;
import chapterFour.PlayGround2;
import org.junit.jupiter.api.Test;

import java.util.*;


import static chapterFour.EnumPlayGround.*;
import static org.junit.jupiter.api.Assertions.*;

public class Play {
    @Test
    void testThatObjectIsCreated(){
        List<Laptop> laptops = new ArrayList<>();
        Laptop laptop1 = new Laptop("Favour");
        Laptop laptop2 = new Laptop("Zion");
        Laptop laptop3 = new Laptop("Samson");
        laptops.add(laptop2);
        laptops.add(laptop1);
        laptops.add(1,laptop3);

        Iterator<Laptop> it = laptops.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());


    }

}
