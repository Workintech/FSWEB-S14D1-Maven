import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.*;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {


        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(1, "ahmet", 1111);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "ayse", 2222);

        System.out.println(juniorDeveloper.toString());
        System.out.println(juniorDeveloper2.toString());

    }
}