public class WatekRunnable3 implements Runnable{
    @Override
    public void run() {
        synchronized (Example.customer) {
            //zmiana nazwiska
            for (int i = 0; i < 10000; i++) {
                Customer temp = Example.customer;
                temp.phone = "123";
                temp.surname = "A";
                Example.customer = temp;
                System.out.println("phone: " + Example.customer.phone + " surname: " + Example.customer.surname);
            }
        }
    }
}
