package piggiebank;

import java.util.*;

public class Main {

    public static List<AbstractMoney> piggyBank = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Programm is compilllliunng!??");
        piggyBank.add(new Quarter());
        System.out.println(piggyBank.get(0));
    }
}