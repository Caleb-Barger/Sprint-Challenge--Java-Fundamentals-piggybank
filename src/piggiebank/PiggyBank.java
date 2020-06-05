package piggiebank;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public double getTotalValue() {
        double rtnValue = 0;
        for (AbstractMoney m : piggyBank) {
            rtnValue += m.getFaceValue();
        }
        return rtnValue;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
    
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public void pullMoney(double amt) {
        double oldTotal = 0.00;
        double newTotal = 0.00;

        double targetValue;
        double currentValue;

        int dollarsToAdd = 0;
        int quartersToAdd = 0;
        int dimesToAdd = 0;
        int nicklesToAdd = 0;
        int PenniesToAdd = 0;
        
        oldTotal = getTotalValue();
        // System.out.println(oldTotal); --> 2.51
        piggyBank.clear();
        // check if oldTotal - amt > 0
        newTotal = (oldTotal - amt);
        currentValue = 0.00;

        targetValue = round(newTotal, 2);
        currentValue = round(currentValue, 2);

        while (round(currentValue, 2) != round(targetValue, 2)) {
            System.out.print("\n" + currentValue);
            while (targetValue - currentValue >= 1.00) {
                if (targetValue - currentValue <= 1.00) {
                    piggyBank.add(new Dollar(dollarsToAdd));
                } else {
                    dollarsToAdd++;
                    currentValue += 1.00;
                    currentValue = round(currentValue, 2);
                }
            }
            while (targetValue - currentValue >= .25) {
                if (targetValue - currentValue <= .25) {
                    piggyBank.add(new Quarter(quartersToAdd));
                } else {
                    quartersToAdd++;
                    currentValue += .25;
                    currentValue = round(currentValue, 2);
                }
            } 
            while (targetValue - currentValue >= .10) {
                if (targetValue - currentValue <= .10) {
                    piggyBank.add(new Dime(dimesToAdd));
                } else {
                    dimesToAdd++;
                    currentValue += .10;
                    currentValue = round(currentValue, 2);
                }
            } 
            while (targetValue - currentValue >= .05) {
                if (targetValue - currentValue <= .05) {
                    piggyBank.add(new Nickle(nicklesToAdd));
                } else {
                    nicklesToAdd++;
                    currentValue += .05;
                    currentValue = round(currentValue, 2);
                }
            } 
            while (targetValue - currentValue >= .01) {
                if (targetValue - currentValue <= .01) {
                    piggyBank.add(new Pennie(PenniesToAdd));
                } else {
                    PenniesToAdd++;
                    currentValue += .01;
                    currentValue = round(currentValue, 2);
                }
            } 
        }
    }
}  