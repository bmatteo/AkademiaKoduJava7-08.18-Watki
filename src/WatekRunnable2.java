public class WatekRunnable2 implements Runnable {
    @Override
    public void run() {
        synchronized (Example.customer) {
            //zmiana nazwiska
            for (int i = 0; i < 10000; i++) {
                Customer temp = Example.customer;
                temp.surname = "B";
                Example.customer = temp;
                System.out.println("phone: " + Example.customer.phone + " surname: " + Example.customer.surname);
            }
        }
    }
}
