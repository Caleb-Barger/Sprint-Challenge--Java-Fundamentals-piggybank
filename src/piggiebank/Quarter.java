package piggiebank;

public class Quarter extends AbstractMoney{
    
    public Quarter(int amt) {
        super(amt, 0.25, "Quarter");
    }
    public Quarter() {
        super(1, 0.25, "Quarter");
    }
}