package piggiebank;

public class Dollar extends AbstractMoney{
    
    public Dollar(double amt) {
        super(amt, 1, "Dollar");
    }
    public Dollar() {
        super(1, 1, "Dollar");
    }
}