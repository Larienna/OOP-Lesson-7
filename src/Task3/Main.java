package Task3;

import java.util.Arrays;
import java.util.Scanner;

class Price implements Comparable<Price> {
    private String productName;
    private String shopName;
    private double price;

    public Price(String productName, String shopName, double price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + productName + ", Shop: " + shopName + ", Price: " + price;
    }
    // интерфейс для сравнивнения и упорядочивания объектов по названию магазина.
    @Override
    public int compareTo(Price other) {
        return this.shopName.compareTo(other.shopName);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Price[] prices = new Price[2]; // Мвссив из 2 элементов

        for (int i = 0; i < prices.length; i++) {
            System.out.println("Введите название товара: ");
            String productName = scanner.nextLine();

            System.out.println("Введите название магазина: ");
            String shopName = scanner.nextLine();

            System.out.println("Введите стоимость товара в гривнах:");
            double price = Double.parseDouble(scanner.nextLine());

            prices[i] = new Price(productName, shopName, price);
        }

        Arrays.sort(prices); // сортируем

        System.out.println("Введите название искомого магазина: ");
        String searchShopName = scanner.nextLine();

        boolean found = false;
        // вывод информации о товарах в магазине с введенным названием
        for (Price price : prices) {
            if (price.getShopName().equals(searchShopName)) {
                System.out.println(price);
                found = true;
            }
        }
        //проверка
        if (!found) {
            System.out.println("Магазин не найден");
        }
    }
}