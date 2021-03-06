package shopping;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock = 0, reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return this.quantityInStock - this.reserved;
    }

    public void setPrice(double price) {
        if(price > 0.0)
            this.price = price;
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0)
            this.quantityInStock = newQuantity;
    }

    public int reserveStock(int quantity) {
        if(quantity <= this.availableQuantity()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unReserveStock(int quantity) {
        if(quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity) {
        if(quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }
        return this.name.equals(((StockItem) obj).getName());
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". Reserved: " + this.reserved;
    }

    @Override
    public int compareTo(StockItem o) {
        if( this == o) {
            return 0;
        }
        if(o != null) {
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }
}
