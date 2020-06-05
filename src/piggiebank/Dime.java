package piggiebank;

public class Dime extends AbstractMoney{
    
    public Dime(int amt) {
        super(amt, 0.10, "Dime");
    }
    public Dime() {
        super(1, 0.10, "Dime");
    }
}