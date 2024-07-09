import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Solution {
    public int solution(int n, int k) {
                Store store = new Store(List.of(
                new Product("양꼬치", 12000),
                new Product("음료수", 2000)
        ));

        Customer customer = new Customer();
        Product 양꼬치 = store.order("양꼬치", n);
        customer.eat(양꼬치);
        Product 음료수 = store.order("음료수", k);
        customer.eat(음료수);

        int toPayPrice = store.checkBill(customer.getAteList());

        return toPayPrice;
    }
    
    class Product {
        private String name;
        private int price;
        private int amount;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public int getTotalPrice() {
            return price * amount;
        }
    }

    class Customer {
        private List<Product> ateList = new ArrayList<>();

        public List<Product> getAteList() {
            return ateList;
        }

        public void eat(Product product) {
            ateList.add(product);
        }
    }

    class Store {
        private List<Product> productList;

        public Store(List<Product> productList) {
            this.productList = productList;
        }

        public Product getProductByName(List<Product> productList, String name) {
            return productList.stream()
                    .filter(it -> it.getName().equals(name))
                    .findFirst()
                    .get();
        }

        public int checkBill(List<Product> totalAteProductList) {
            int totalAtePrice = productList
                    .stream()
                    .mapToInt(Product::getTotalPrice)
                    .sum();
            int servicePrice = getServicePrice(totalAteProductList);
            
            return totalAtePrice - servicePrice;
        }

        private int getServicePrice(List<Product> productList) {
            Function<List<Product>, Integer> serviceFunc = (list) -> {
                // 양꼬치 10개에 음료수 1개 서비스
                Product 양꼬치 = getProductByName(list, "양꼬치");
                int 서비스_음료수_개수 = 양꼬치.getAmount() / 10;
                Product 음료수 = getProductByName(list, "음료수");
                int resultPrice =  음료수.getPrice() * 서비스_음료수_개수;
                return Math.min(resultPrice, 음료수.getTotalPrice());
            };

            return serviceFunc.apply(productList);
        }

        public Product order(String productName, int amount) {
            Product product = getProductByName(productList, productName);
            product.setAmount(amount);
            return product;
        }
    }
}