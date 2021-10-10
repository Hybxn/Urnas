import java.util.ArrayList;

public class Color {

    //Array final que contiene todos los colores disponibles
    private static final String[] todosColores = new String[]{
            "Roja", "Azul", "Amarilla", "Negra", "Blanca", "Fucsia", "Naranja", "Verde", "Lila"
    };
    //Array dinamico de donde se cogeran colores al azar
    private static ArrayList<String> colores = new ArrayList<>();

    //Metodos de utilidad de la clase Color
    public static void iniciarColores() {//Metodo para rellenar la coleccion dinamica de colores
        for (String color : todosColores)
            colores.add(color);
    }

    public static String cogerColor() {//Metodo que devuelve un color
        assert !colores.isEmpty() && colores != null :
                "ERROR. NO QUEDAN MAS COLORES DISPONIBLES.";
        String aux = colores.get((int) (Math.random() * colores.size()));
        colores.remove(aux);
        return aux;
    }
}
