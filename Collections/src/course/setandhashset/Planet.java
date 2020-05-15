package course.setandhashset;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbPeriod) {
        super(name, orbPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        //only moons are accepted as satellites
        if ( satellite.getKey().getBodyType() == BodyTypes.MOON ){
            return super.addSatellite(satellite);
        }

        return false;
    }
}
