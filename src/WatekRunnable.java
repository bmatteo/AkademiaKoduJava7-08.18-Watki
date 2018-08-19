public class WatekRunnable implements Runnable {

    @Override
    public void run() {
        synchronized (Example.customer) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //zmiana telefonu
            for(int i = 0; i < 10000; i++) {
                Customer temp = Example.customer;
                temp.phone = "234";
                Example.customer = temp;
                System.out.println("phone: " + Example.customer.phone + " surname: " + Example.customer.surname);
            }
        }
    }
}
