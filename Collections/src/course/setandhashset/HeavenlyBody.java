package course.setandhashset;

import java.util.HashSet;
import java.util.Set;

final class HeavenlyBody {
    private final String name;
    private final double orbPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbPeriod) {
        this.name = name.toLowerCase();
        this.orbPeriod = orbPeriod;
        this.satellites = new HashSet<>();
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public String getName() {
        return name;
    }

    public double getOrbPeriod() {
        return orbPeriod;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        System.out.println("object.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if (obj== null || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName =  ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);

    }

}
