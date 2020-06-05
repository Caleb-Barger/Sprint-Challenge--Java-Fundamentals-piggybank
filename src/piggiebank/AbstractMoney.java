package piggiebank;

abstract class AbstractMoney {

    protected double amt;
    protected double faceValue;
    protected String name;

    AbstractMoney(double amt) {
        this.amt = amt;
    }

    @Override
    public String toString() {
        if (name.equals("Dollar")) {
            return String.format("\n$%s", amt);
        }
        else if (amt <=  1) {
            return String.format("\n%s %s", amt, name);
        } else {
            return String.format("\n%s %ss", amt, name);
        } 
    }
}