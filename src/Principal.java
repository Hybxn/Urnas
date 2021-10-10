public class Principal {

    public static void main(String[] args) {

        Color.iniciarColores();

        Urna u1 = new Urna();

        u1.agregarBola();
        u1.agregarBola();
        u1.agregarBola();

        System.out.println(u1);

        System.out.println("Quitando una bola.......");
        u1.quitarBola();

        System.out.println("Agregando una nueva bola.........");
        u1.agregarBola(new Bola("Arcoiris"));
        System.out.println(u1);
    }
}
