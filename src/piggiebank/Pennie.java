package piggiebank;

public class Pennie extends AbstractMoney{
    
    public Pennie(int amt) {
        super(amt, 0.01, "Pennie");
    }
    public Pennie() {
        super(1, 0.01, "Pennie");
    }
}