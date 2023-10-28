package roboter;

public class Max2000 extends Roboter implements MusikRoboter, SprechenderRoboter{

    public Max2000(String name, int gewicht, int schrittlaenge) {
        super(name, gewicht, schrittlaenge);
    }

    @Override
    public void musikSpielen() {
        System.out.print("lalala");
    }

    @Override
    public void sprechen(String str) {
        System.out.print(str);
    }
}
