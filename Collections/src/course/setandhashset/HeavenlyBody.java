package course.setandhashset;

import java.util.HashSet;
import java.util.Set;
// if class is declared final cannot be subclassed
// we make  HeavenlyBody class abstract so It cannot be instantiated
//public final class HeavenlyBody {
public abstract class HeavenlyBody {

    //private final String name;
    private final Key key;
    private final double orbPeriod;
    private final Set<HeavenlyBody> satellites;
    public enum BodyTypes { MOON, PLANET, STAR, COMET, ASTEROID }
    //private final BodyTypes bodyType;

    public HeavenlyBody(String name, double orbPeriod, BodyTypes bodyType) {
        this.key = new Key(name,bodyType);
        //this.name = name.toLowerCase();
        this.orbPeriod = orbPeriod;
        this.satellites = new HashSet<>();
        //this.bodyType = bodyType;

    }

    public boolean addSatellite(HeavenlyBody satellite){
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public Key getKey() {
        return key;
    }

    public double getOrbPeriod() {
        return orbPeriod;
    }

    //we make it final so instances cannot override the method
    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof HeavenlyBody){
            HeavenlyBody theObject = (HeavenlyBody) obj;
            //check the name of the instance
            return this.key.equals(theObject.getKey());
        }
        //otherwise is not equals and return false
        return false;

    }
    //we make it final so instances cannot override the method
    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType){
        return new Key(name.toLowerCase(),bodyType);
    }

    @Override
    public String toString() {
        return this.key.getName() + ": " + this.key.getBodyType() + ", "+ this.getOrbPeriod();
    }


    //inner class
    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType;
        }
    }
    //end of inner class
}
