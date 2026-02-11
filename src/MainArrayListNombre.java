import java.util.ArrayList;

public class MainArrayListNombre {

    public static void main(String[] args) {

        /* Creo un ArrayList de tipo String(nombres)
        Un ArrayList: Mantiene el orden de inserción.
                       Permite elementos duplicados.
                       Permite acceder, modificar y eliminar elementos por índice. */

        ArrayList<String> nombres = new ArrayList<>();

        // Añado nombres al ArrayList
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");

        // Muestro todos los nombres del ArrayList
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Se elimina un nombre concreto del ArrayList
        nombres.remove("Luis");

        // Muestro una lista después de eliminar un elemento
        System.out.println("\nLista de nombres después de eliminar 'Luis':");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
