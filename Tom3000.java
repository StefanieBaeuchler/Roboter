package roboter;

public class Tom3000 extends Roboter implements SprechenderRoboter {

    public Tom3000(String name, int gewicht, int schrittlaenge) {
        super(name, gewicht, schrittlaenge);
    }

    @Override
    public void sprechen(String str) {
        System.out.print(str);
    }
}
