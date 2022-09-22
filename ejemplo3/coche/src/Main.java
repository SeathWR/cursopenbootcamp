public class Coche {
    string color;
    int puertas;
    int ruedas;

    public void añadirPuertas() {
        puertas++; // Para añadir 1 puerta
        puertas += 2, 3, 4, 5.... // Para añadir un número concreto
    }
    public static void main(String[] args) {
        Coche myCoche = new Coche();
        myCoche.añadirPuertas();
    }
}