package piggiebank;

import java.util.*;

public class PiggyBank {
    public List<AbstractMoney> piggyBank;

    public PiggyBank() {
        piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Pennie(10));
    }

    public void whatsInTheBank() {
        piggyBank.forEach(g -> System.out.println(g));
    }

    public void getTotalValue() {
        double rtnValue = 0;
        for (AbstractMoney m : piggyBank) {
            rtnValue += m.getFaceValue();
        }
        System.out.println(String.format("The piggy bank holds $%s\n\n", rtnValue));
    }
}