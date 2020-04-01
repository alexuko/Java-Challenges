package course.setandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("mercury",80);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        HeavenlyBody moonTemp = new HeavenlyBody("moon",27);
        solarSystem.put(moonTemp.getName(),moonTemp);
        planets.add(temp);
        temp.addMoon(moonTemp);

        temp = new HeavenlyBody("mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        moonTemp = new HeavenlyBody("deinos",1.3);
        solarSystem.put(moonTemp.getName(),moonTemp);
        temp.addMoon(moonTemp);
        moonTemp = new HeavenlyBody("phobos",0.3);
        solarSystem.put(moonTemp.getName(),moonTemp);
        temp.addMoon(moonTemp);


        temp = new HeavenlyBody("jupiter",4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        moonTemp = new HeavenlyBody("Io",1.8);
        solarSystem.put(moonTemp.getName(),moonTemp);
        temp.addMoon(moonTemp);
        moonTemp = new HeavenlyBody("alpha",3.5);
        solarSystem.put(moonTemp.getName(),moonTemp);
        temp.addMoon(moonTemp);


        temp = new HeavenlyBody("saturn",10759);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new HeavenlyBody("uranus",30660);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new HeavenlyBody("neptune",165);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);
        temp = new HeavenlyBody("pluto",248);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);


        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }
        
        HeavenlyBody tempPlanet = solarSystem.get("jupiter");
        System.out.println("Moons of " + tempPlanet.getName());
        for (HeavenlyBody moon : tempPlanet.getSatellites()) {
            System.out.println("\t" + moon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("all moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

    }
}
