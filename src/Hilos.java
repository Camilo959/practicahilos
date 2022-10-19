public class Hilos extends Thread {

    public Hilos(String nombre) {
        super(nombre);
    }

    @Override //
    public void run() {
        // En este metodo iniciamos el algoritmo

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + " -> " + i);
                sleep(500);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}
