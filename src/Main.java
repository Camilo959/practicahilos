public class Main {

    public static void main(String[] args) {
        // Crear hilos
        Hilos tarea1 = new Hilos("Tarea1");
        Hilos tarea2 = new Hilos("Tarea2");

        tarea1.start();
        tarea2.start();

    }
}
