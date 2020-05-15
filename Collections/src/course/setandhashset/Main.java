package course.setandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("mercury",80);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("venus",225);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);

        temp = new Planet("earth",365);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        HeavenlyBody moonTemp = new Moon("moon",27);
        solarSystem.put(temp.getKey(),moonTemp);
        planets.add(temp);
        temp.addSatellite(moonTemp);

        temp = new Planet("mars",687);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        moonTemp = new Moon("deinos",1.3);
        solarSystem.put(temp.getKey(),moonTemp);
        temp.addSatellite(moonTemp);
        moonTemp = new Moon("phobos",0.3);
        solarSystem.put(temp.getKey(),moonTemp);
        temp.addSatellite(moonTemp);


        temp = new Planet("jupiter",4332);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        moonTemp = new Moon("Io",1.8);
        solarSystem.put(temp.getKey(),moonTemp);
        temp.addSatellite(moonTemp);
        moonTemp = new Moon("alpha",3.5);
        solarSystem.put(temp.getKey(),moonTemp);
        temp.addSatellite(moonTemp);


        temp = new Planet("saturn",10759);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        temp = new Planet("uranus",30660);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        temp = new Planet("neptune",165);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);
        temp = new Planet("pluto",248);
        solarSystem.put(temp.getKey(),temp);
        planets.add(temp);


        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody tempPlanet = solarSystem.get(HeavenlyBody.makeKey("jupiter", HeavenlyBody.BodyTypes.PLANET)   );
        System.out.println("Moons of " + tempPlanet.getKey());
        for (HeavenlyBody moon : tempPlanet.getSatellites()) {
            System.out.println("\t" + moon.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("all moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        HeavenlyBody pluto = new Comet("pluto", 600);
        planets.add(pluto);


        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        HeavenlyBody earth = new Planet("earth", 500);
        HeavenlyBody earth1 = new Planet("earth", 501);
        System.out.println(earth.equals(earth1));
        System.out.println(earth1.equals(earth));
        System.out.println(earth.equals(pluto));
        System.out.println(pluto.equals(earth));

        solarSystem.put(pluto.getKey(),pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.COMET)));

        System.out.println("==================================");
        System.out.println("Solar system");
        for (HeavenlyBody heavenlyBody : solarSystem.values()){
            System.out.println(heavenlyBody);
        }



    }
}
