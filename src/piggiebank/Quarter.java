package piggiebank;

public class Quarter extends AbstractMoney{
    
    public Quarter(double amt) {
        super(amt);
        faceValue = 0.25;
        name = "Quarter";
    }

    public Quarter() {
        super(1);
        faceValue = 0.25;
        name = "Quarter";
    }
}