public class AnimalFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Animal(name, price);
    }
}

