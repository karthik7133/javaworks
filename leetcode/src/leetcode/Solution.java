package leetcode;

import java.util.*;

class Bike {
    private int id;
    private int quantity;
    private String name;
    private int price;

    public Bike(int id, int quantity, String name, int price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of bikes:");
        int n = Integer.parseInt(sc.nextLine());
        Bike[] bikes = new Bike[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID for bike " + (i + 1) + ":");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Quantity for bike " + (i + 1) + ":");
            int quantity = Integer.parseInt(sc.nextLine());

            System.out.println("Enter Name for bike " + (i + 1) + ":");
            String name = sc.nextLine();

            System.out.println("Enter Price for bike " + (i + 1) + ":");
            int price = Integer.parseInt(sc.nextLine());

            bikes[i] = new Bike(id, quantity, name, price);
        }

        System.out.println("Enter bike name to search:");
        String searchName = sc.nextLine();

        Bike maxPriceBike = findMaxPriceOfBike(bikes);
        if (maxPriceBike != null && maxPriceBike.getPrice() > 0) {
            System.out.println("id-" + maxPriceBike.getId());
            System.out.println("quantity-" + maxPriceBike.getQuantity());
            System.out.println("name-" + maxPriceBike.getName());
            System.out.println("price-" + maxPriceBike.getPrice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }

        Bike foundBike = searchBikeByName(bikes, searchName);
        if (foundBike != null) {
            System.out.println("id-" + foundBike.getId());
            System.out.println("quantity-" + foundBike.getQuantity());
            System.out.println("name-" + foundBike.getName());
            System.out.println("price-" + foundBike.getPrice());
        } else {
            System.out.println("No Bike found with mentioned attribute");
        }
    }

    public static Bike findMaxPriceOfBike(Bike[] bikes) {
        if (bikes == null || bikes.length == 0) return null;

        Bike maxBike = null;
        int maxPrice = 0;

        for (Bike bike : bikes) {
            if (bike.getPrice() > maxPrice) {
                maxPrice = bike.getPrice();
                maxBike = bike;
            }
        }

        return maxBike;
    }

    public static Bike searchBikeByName(Bike[] bikes, String name) {
        if (bikes == null || name == null) return null;

        for (Bike bike : bikes) {
            if (bike.getName().equalsIgnoreCase(name)) {
                return bike;
            }
        }
        return null;
    }
}
