public class Watek1 extends Thread {
    @Override
    public void run() {
        for (int i= 0; i < 10000; i++) {
            System.out.println("Jestem wątek1: " + i);
        }
    }
}
