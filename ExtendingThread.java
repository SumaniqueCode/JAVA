
// class ExtendingThread extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String args[]) {
//         ExtendingThread thread1 = new ExtendingThread();
//         thread1.start();

//         ExtendingThread thread2 = new ExtendingThread();
//         thread2.start();
//     }
// }

class ExtendingThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            // the thread will sleep for the 500 milli seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        ExtendingThread t1 = new ExtendingThread();
        ExtendingThread t2 = new ExtendingThread();

        t1.start();
        t2.start();
    }
}