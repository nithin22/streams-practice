package shopping;


class ShoppingCartItem {
    String name;
    double price;
    String category;
    int quantity;

    public ShoppingCartItem(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ShoppingCartItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}