package course.setandhashset;

public class DogMain {
    public static void main(String[] args) {
        Dog taz = new Dog("taz");
        Terrier taz_T = new Terrier("taz");

        System.out.println(taz.equals(taz_T));
        System.out.println(taz_T.equals(taz));
    }
}
