package roboter;

import java.util.ArrayList;
import java.util.List;

public class Roboter {

    private String name;
    private int gewicht;
    private int schrittlaenge;


    public Roboter(String name, int gewicht, int schrittlaenge) {
        this.name = name;
        this.gewicht = gewicht;
        this.schrittlaenge = schrittlaenge;
    }


    public void gehen(int anzSchritte) {
        if (this.gewicht <= 5) {
           int schritte = Math.max(anzSchritte, 20);
        }
        if (this.gewicht > 5 && this.gewicht <= 10) {
            int schritte = Math.max(anzSchritte, 15);
        }
        if (this.gewicht > 10 && this.gewicht <= 15) {
            int schritte = Math.max(anzSchritte, 10);
        }
        if (this.gewicht > 15) {
            int schritte = Math.max(anzSchritte, 5);
        }

        int meter = anzSchritte * (this.getSchrittlaenge() / 100);
        System.out.printf("%s (%s) geht %d Meter.\n",
                this.getClass().getName(),
                this.getName(),
                meter);
        System.out.println();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getSchrittlaenge() {
        return schrittlaenge;
    }

    public void setSchrittlaenge(int schrittlaenge) {
        this.schrittlaenge = schrittlaenge;
    }


}
