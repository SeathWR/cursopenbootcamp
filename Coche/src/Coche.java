public class Coche {

    private String color;
    private String Puertas;

    public static void main (String[] args) {
            Coche myCoche = new Coche();

            myCoche.anadirPuertas();
            myCoche.color = "rojo";

            System.out.println("el coche es de color " +myCoche.color);
            System.out.println("y tiene un total de "+myCoche.Puertas+" puertas ");

        }

        public void anadirPuertas() {
            Puertas+= 5; //Para añadir 1 puerta


    }
}