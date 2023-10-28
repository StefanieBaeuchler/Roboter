package roboter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Roboter> roboter = new ArrayList<>();


    public static void main(String[] args) {

        initDemoData();


    }




    public static void initDemoData() {
        Ed5000 ed5000 = new Ed5000("Kevin", 5, 3);
        Max2000 max2000 = new Max2000("Sissi", 9, 5);
        Tom3000 tom3000 = new Tom3000("Cinderella", 18, 4);

        roboter.add(ed5000);
        roboter.add(max2000);
        roboter.add(tom3000);

        ed5000.gehen(200);
        max2000.gehen(300);
        tom3000.gehen(400);

        max2000.sprechen("word");
        max2000.musikSpielen();
        tom3000.sprechen("gg");
        ed5000.musikSpielen();

    }
}