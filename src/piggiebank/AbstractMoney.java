package piggiebank;

abstract class AbstractMoney {

    protected double amt;
    protected double faceValue;
    protected String name;

    AbstractMoney(double amt, double faceValue, String name) {
        this.amt = amt;
        this.faceValue = faceValue;
        this.name = name;
    }

    public double getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        if (name.equals("Dollar")) {
            return String.format("$%s", (int)amt);
        }
        else if (amt <=  1) {
            return String.format("%s %s", (int)amt, name);
        } else {
            return String.format("%s %ss", (int)amt, name);
        } 
    }
}