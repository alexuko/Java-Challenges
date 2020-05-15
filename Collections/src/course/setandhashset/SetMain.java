package course.setandhashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        String sentence = "This is just a test";
        String[] arrWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrWords));
        for (String word : words) {
            System.out.println(word);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] arrNatWords = {"tree","water","is","soil","wind","to","grass","animals"};
        nature.addAll(Arrays.asList(arrNatWords));

        String[] arrDevWords = {"err","human","forgive","is","to","divide","fight"};
        divine.addAll(Arrays.asList(arrDevWords));

        System.out.println("nature - divine");
        Set<String> diff = new HashSet<>(nature);
        diff.removeAll(divine);
        printSet(diff);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> union = new HashSet<>(nature);
        union.addAll(divine);

        Set<String> intersection = new HashSet<>(nature);
        intersection.retainAll(divine);
        System.out.println("intersection");
        printSet(intersection);


        System.out.println("Symmetric difference");
        union.removeAll(intersection);
        printSet(union);

    }

    private static void printSet(Set<String> diff) {
        for (String i : diff) {
            System.out.print( i +"," );
        }
        System.out.println();
    }

}
