package BillsBurgers;

public class Hamburger {
    private String name, meat, breadRollType, addition1Name, addition2Name, addition3Name, addition4Name;
    private double price, addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name=addition1Name;
        this.addition1Price=addition1Price;
        price+=addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name=addition2Name;
        this.addition2Price=addition2Price;
        price+=addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name=addition3Name;
        this.addition3Price=addition3Price;
        price+=addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name=addition4Name;
        this.addition4Price=addition4Price;
        price+=addition4Price;
    }

    public double itemizeHamburger() {
        return price;
    }
}
