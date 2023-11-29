package shopping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    public static List<ShoppingCartItem> calculateTotalPrice(List<ShoppingCartItem> cartItems) {
        // Your code here
//        return cartItems.stream().collect(Collectors.groupingBy(shoppingCartItem -> shoppingCartItem.category,Collectors.summingDouble(item->item.price* item.quantity))).values().stream().mapToDouble(Double::doubleValue).sum();
//        return cartItems.stream().filter(s->s.category.equals("Electronics")).mapToDouble(item->item.price*item.quantity).sum();
//        return cartItems.stream().sorted(Comparator.comparingDouble(item->item.price)).collect(Collectors.toList());

        return cartItems.stream().sorted((i,j)->Double.compare(j.price,i.price)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<ShoppingCartItem> cart = new ArrayList<>();
        cart.add(new ShoppingCartItem("Product A", 10.0, "Electronics", 2));
        cart.add(new ShoppingCartItem("Product B", 5.0, "Clothing", 3));
        cart.add(new ShoppingCartItem("Product C", 15.0, "Electronics", 1));
        cart.add(new ShoppingCartItem("Product D", 20.0, "Groceries", 4));

        var totalPrice = calculateTotalPrice(cart);

        System.out.println("Total price: $" + totalPrice);
    }
}