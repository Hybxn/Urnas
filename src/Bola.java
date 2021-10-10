public class Bola {

    //Atributos
    private String color;

    //Constructores
    public Bola(){//Constructor sin parametros de entrada
        setColor(Color.cogerColor());
    }

    public Bola (String color){//Constructor con parametro de entrada
        setColor(color);
    }

    //Getter & Setter de color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString de bola
    @Override
    public String toString(){
        return String.format("Bola %s, ", getColor());
    }
}
