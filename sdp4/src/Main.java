public class Main {
    public static void main(String[] args) {
        ProductFactory animalFactory = new AnimalFactory();
        Product cow = animalFactory.createProduct("Cow", 500.0);

        ProductFactory cropFactory = new CropFactory();
        Product wheat = cropFactory.createProduct("Wheat", 2.0);

        System.out.println("Product: " + cow.getName() + ", Price: $" + cow.getPrice());
        System.out.println("Product: " + wheat.getName() + ", Price: $" + wheat.getPrice());
    }
}
