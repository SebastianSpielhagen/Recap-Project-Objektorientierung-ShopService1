import java.util.List;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {
    public Order(String string, List<Product> products) {
        this(string, products, OrderStatus.OPEN);
    }
}
