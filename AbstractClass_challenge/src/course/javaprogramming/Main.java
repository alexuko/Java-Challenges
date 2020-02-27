package course.javaprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String states = "Aguascalientes Zacatecas Baja_California Baja_California_Sur Chihuahua Colima Campeche Coahuila Chiapas Federal_District Durango Guerrero Guanajuato Hidalgo Jalisco México_State Michoacán Morelos Nayarit Nuevo_León Puebla Querétaro Quintana_Roo Sinaloa San_Luis_Potosí Sonora Tabasco Tlaxcala Tamaulipas Veracruz Yucatán Zacatecas";
        String statesArray[] = states.split(" ");
        for (String state : statesArray) {
            list.addItem(new Node(state));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("Aguascalientes"));
        list.removeItem(new Node("Zacatecas"));
        list.removeItem(new Node("Baja_California"));
        list.removeItem(new Node("null"));
        list.traverse(list.getRoot());

    }
}
