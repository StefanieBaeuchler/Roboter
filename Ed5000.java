package roboter;

public class Ed5000 extends Roboter implements MusikRoboter{

    public Ed5000(String name, int gewicht, int schrittlaenge) {
        super(name, gewicht, schrittlaenge);
    }
    @Override
    public void musikSpielen() {
        System.out.print("lalala");
    }
}
