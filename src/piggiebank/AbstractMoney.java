package piggiebank;

abstract class AbstractMoney {

    protected int amt;
    protected double faceValue;
    protected String name;

    AbstractMoney(int amt, double faceValue, String name) {
        this.amt = amt;
        this.faceValue = faceValue;
        this.name = name;
    }

    public double getFaceValue() {
        return faceValue*amt;
    }

    @Override
    public String toString() {
        if (name.equals("Dollar")) {
            return String.format("$%s", amt);
        }
        else if (amt <=  1) {
            return String.format("%s %s", amt, name);
        } else {
            return String.format("%s %ss", amt, name);
        } 
    }
}