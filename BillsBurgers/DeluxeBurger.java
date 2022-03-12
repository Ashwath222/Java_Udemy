package BillsBurgers;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Bacon", 19.10, "Whole Grain");
        super.addHamburgerAddition1("Chips",0);
        super.addHamburgerAddition2("Drink",0);
    }
    final String MESSAGE="No additional items can be added";

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println(MESSAGE);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println(MESSAGE);
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println(MESSAGE);
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println(MESSAGE);
    }
}
