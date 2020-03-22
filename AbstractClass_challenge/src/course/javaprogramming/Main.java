package course.javaprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String states = "Aguascalientes Zacatecas Baja_California Baja_California_Sur Chihuahua Colima Campeche Coahuila Chiapas Federal_District Durango Guerrero Guanajuato Hidalgo Jalisco México_State Michoacán Morelos Nayarit Nuevo_León Puebla Querétaro Quintana_Roo Sinaloa San_Luis_Potosí Sonora Tabasco Tlaxcala Tamaulipas Veracruz Yucatán Zacatecas";
        String statesArray[] = states.split(" ");
        for (String state : statesArray) {
            tree.addItem(new Node(state));
        }

        tree.traverse(tree.getRoot());
//        tree.removeItem(new Node("Aguascalientes"));
//        tree.removeItem(new Node("Zacatecas"));
//        tree.removeItem(new Node("Baja_California"));
//        tree.removeItem(new Node("null"));
//        tree.traverse(tree.getRoot());


    /*
    *

        String str1 = "ab";
        String str2 = "ab";
        String str3 = "ba";
        String str4 = "a";

        int result = str1.compareTo( str2 );
        System.out.println(result); -> 0

        result = str1.compareTo( str3 );
        System.out.println(result); -> -1

        result = str1.compareTo( str4 );
        System.out.println(result); -> 1

        result = str4.compareTo( str1 );
        System.out.println(result); `-> -1
    */



    }
}
