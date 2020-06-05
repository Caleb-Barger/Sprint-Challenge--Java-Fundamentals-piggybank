package piggiebank;

public class Main {

    public static PiggyBank firstPiggyBank = new PiggyBank(); 

    public static void main(String[] args) {
        System.out.println("\n\n*** Money Groups in PiggyBank ***\n");
        firstPiggyBank.whatsInTheBank();
        System.out.println("\n\n*** Value of money in PiggyBank ***\n");
        System.out.println(String.format("The piggy bank holds $%s\n\n", firstPiggyBank.getTotalValue()));
        // firstPiggyBank.pullMoney(1.00); RIP :(
        System.out.println("\n\n*** Money Groups in PiggyBank ***\n");
        firstPiggyBank.whatsInTheBank();
    }
}