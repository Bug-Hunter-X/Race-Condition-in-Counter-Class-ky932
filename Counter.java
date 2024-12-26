public class Counter {
    private int count = 0; // This declaration is outside the synchronized block

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count; // This getter is not synchronized
    }
}