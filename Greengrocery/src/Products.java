public abstract class  Products {
    private String name;
    private int amount;
    private int price;



    public Products(String name, int amount, int price) {
        this.name = name;
        this.amount = amount;
        this.price=price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public int setPrice(int price) {
        this.price = price;
        return price;
    }
}
