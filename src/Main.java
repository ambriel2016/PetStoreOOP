public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        String name = "Bob";
        a.setName(name);
        System.out.println(a.getName());

        String type = "LabradorRetriever";
        a.setType(type);
        System.out.println(a.getType());

        String description = "Canis";
        a.setDescription(description);
        System.out.println(a.getDescription());

        String price = "20.00";
        a.setPrice(price);
        System.out.println(a.getPrice());

        boolean isInStock = true;
        boolean isInStock2 = false;
        a.setIsInStock(false);
        a.setIsInStock(isInStock);
        System.out.println(a.getIsInStock());

        Animal b = new Animal();
        b.setName("Victor");
        b.setDescription("teacher");

        System.out.println("First animal name was: " + a.getName() + " and Second animal name was: " + b.getName());
    }
}
