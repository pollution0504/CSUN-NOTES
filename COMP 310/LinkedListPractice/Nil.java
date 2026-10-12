public class Nil implements IList {
    public Nil();
    public boolean isEmpty() {
        return true;
    }

    public int length() {
        return 0;
    }

    // [].addAmount(3): []
    public IList addAmount(int amount) {
        // Two ways of returning
        // 1) return new Nil(); <-- Returns a new instance of Nil
        // 2) return this; <-- More effecient / Points to the same instance

        return this;
    }
}