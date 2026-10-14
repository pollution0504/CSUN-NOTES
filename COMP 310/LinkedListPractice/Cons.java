public class Cons implements IList {
    public final int head;
    public final IList tail;

    public Cons(final int head, final IList tail) {
        this.head = head;
        this.tail = tail;
    }
    public int length() {
        return 1 + tail.length();
    }
    // [2,1,3].addAmount(1): [3,2,4]
    // [5].addAmount(4): [9]
    // [3,0].addAmount(2): [5,2]
    public IList addAmount(int amount) {
        return new Cons(head + amount, tail.addAmount(amount));
    }
}