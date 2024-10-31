public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "MacBook";
        product.price = 5000;
        product.stockAmount = 10;
        System.out.println(product.name);
        System.out.println(product.id);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}