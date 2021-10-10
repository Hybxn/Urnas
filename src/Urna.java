public class Urna {

    //Constante para marcar el maximo de bolas dentro de una urna.
    private static final int MAX_BOLAS = 3;

    //Atributo de tipo Array para guardar las bolas
    private Bola[] bolas;

    //Constructor
    public Urna() {
        bolas = new Bola[MAX_BOLAS];
    }

    //Getter & Setter del Array de Bolas
    public Bola[] getBolas() {
        return bolas;
    }

    public void setBolas(Bola[] bolas) {
        this.bolas = bolas;
    }

    //toString
    @Override
    public String toString() {
        String datos = "";
        for (Bola bola : bolas) {
            if (bola != null)
            datos += bola.toString();
        }
        return datos;
    }

    //Funcionalidades de la clase Urna

    public boolean estaVacia() { //Metodo que comprueba si la urna esta vacia.
        boolean vacia = true;
        for (Bola bola : bolas) {
            if (bola != null) {
                vacia = false;
                break;
            }
        }
        return vacia;
    }

    public boolean estaLlena() { //Metodo que comprueba si la urna esta llena.
        boolean llena = true;
        for (Bola bola : bolas) {
            if (bola == null) {
                llena = false;
                break;
            }
        }
        return llena;
    }

    public int numeroBolas() { //Metodo que devuelve el numero de las bolas que hay en una urna
        int total = 0;
        for (Bola bola : bolas) {
            if (bola != null) {
                total++;
            }
        }
        return total;
    }

    public void agregarBola(Bola bola) { //Metodo que agrega una bola ya creada
        assert !estaLlena() :
                String.format("No se pueden introducir mas bolas, la urna esta llena (%d,%d)", numeroBolas(), MAX_BOLAS);
        if (estaVacia())
            bolas[0] = bola;
        else {
            for (int i = 1; i < bolas.length; i++) {
                if (bolas[i] == null) {
                    bolas[i] = bola;
                    break;
                }
            }
        }
    }

    public void agregarBola() { //Metodo que agrega una bola con un color al azar
        agregarBola(new Bola());
    }

    public void quitarBola(int i) {//Metodos que quitan una bola segun el indice
        assert i <= MAX_BOLAS;
        assert !estaVacia();
        bolas[i] = null;
    }

    public void quitarBola() {//Metodo que quita la primera bola qyue se encuentre
        int i = MAX_BOLAS;
        for (int j = 0; j < i; j++) {
            if (bolas[j] != null) {
                i = j;
            }
        }
        if (i != MAX_BOLAS)
            quitarBola(i);
    }
}
