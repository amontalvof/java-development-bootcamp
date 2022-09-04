package models;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        boolean isValidName = checkName(name);
        boolean isValidPrice = checkPrice(price);

        if (isValidName && isValidPrice) {
            this.name = name;
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid name or price");
        }
    }

    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        boolean isValidName = checkName(name);
        if (isValidName) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public void setPrice(double price) {
        boolean isValidPrice = checkPrice(price);
        if (isValidPrice) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price");
        }
    }

    public String toString() {
        return name + ": $" + price + " ";
    }

    private boolean checkName(String name) {
        return !(name == null || name.isEmpty());
    }

    private boolean checkPrice(double price) {
        return price >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return this.name.equals(item.name) && this.price == item.price;
    }
}
