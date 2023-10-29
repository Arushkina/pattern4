public class CropFactory implements ProductFactory {
    @Override
    public Product createProduct(String name, double price) {
        return new Crop(name, price);
    }
}
