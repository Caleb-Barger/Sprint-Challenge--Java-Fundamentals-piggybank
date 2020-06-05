package piggiebank;

public class Nickle extends AbstractMoney{
    
    public Nickle(double amt) {
        super(amt, 0.05, "Nickle");
    }
    public Nickle() {
        super(1, 0.05, "Nickle");
    }
}