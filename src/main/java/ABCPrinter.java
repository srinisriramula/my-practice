public class ABCPrinter {

    private static final int PRINT_COUNT = 100; // Number of times each character should be printed
    private static final Object lock = new Object();
    private static int turn = 0; // 0 for A, 1 for B, 2 for C

    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintTask('A', 0));
        Thread threadB = new Thread(new PrintTask('B', 1));
        Thread threadC = new Thread(new PrintTask('C', 2));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    static class PrintTask implements Runnable {
        private final char character;
        private final int threadTurn;

        public PrintTask(char character, int threadTurn) {
            this.character = character;
            this.threadTurn = threadTurn;
        }

        @Override
        public void run() {
            for (int i = 0; i < PRINT_COUNT; i++) {
                synchronized (lock) {
                    while (turn != threadTurn) {
                        try {
                            lock.wait(); // Wait until it's this thread's turn
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.print(character); // Print the character
                    turn = (turn + 1) % 3; // Update turn to the next thread
                    lock.notifyAll(); // Notify all threads to check the condition
                }
            }
        }
    }
}
