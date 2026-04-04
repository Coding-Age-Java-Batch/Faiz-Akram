package FoodDelivery;

import java.util.*;

// Custom Exception 1
class FoodItemNotFoundException extends Exception {
    public FoodItemNotFoundException(String message) {
        super(message);
    }
}

// Custom Exception 2
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

// FoodItem Class
class FoodItem {
    private int itemId;
    private String name;
    private final String category;
    private double price;

    public FoodItem(int itemId, String name, String category, double price) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    public void displayItem() {
        System.out.println(itemId + " | " + name + " | " + category + " | ₹" + price);
    }
}

// OrderItem Class
class OrderItem {
    public FoodItem foodItem;
    private int quantity;

    public OrderItem(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
    }


    public FoodItem getFoodItem() { return foodItem; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() { return quantity; }



    public double getTotalPrice() {
        return foodItem.getPrice() * quantity;
    }
}

// Order Class
class Order {
    private int orderId;
    private String customerName;
    private ArrayList<OrderItem> orderItems;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderItems = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(int itemId) {
        orderItems.removeIf(item -> item.getFoodItem().getItemId() == itemId);
    }

    public void updateItem(int itemId, int newQty) {
        for (OrderItem item : orderItems) {
            if (item.getFoodItem().getItemId() == itemId) {
                item.setQuantity(newQty);
            }
        }
    }

    public double calculateSubtotal() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double calculateGST() {
        return calculateSubtotal() * 0.05;
    }

    public double calculateTotal() {
        return calculateSubtotal() + calculateGST();
    }

    public void printBill() {
        System.out.println("\n===== BILL =====");
        System.out.println("Customer: " + customerName);

        for (OrderItem item : orderItems) {
            System.out.println(
                    item.getFoodItem().getName() +
                            " | Qty: " + item.getQuantity() +
                            " | ₹" + item.getTotalPrice()
            );
        }

        System.out.println("----------------------");
        System.out.println("Subtotal: ₹" + calculateSubtotal());
        System.out.println("GST (5%): ₹" + calculateGST());
        System.out.println("Total: ₹" + calculateTotal());
    }
}

// Restaurant Class
class Restaurant {
    private ArrayList<FoodItem> menu;

    public Restaurant() {
        menu = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("\n--- MENU ---");
        for (FoodItem item : menu) {
            item.displayItem();
        }
    }

    public FoodItem findFoodItemById(int id) throws FoodItemNotFoundException {
        for (FoodItem item : menu) {
            if (item.getItemId() == id) {
                return item;
            }
        }
        throw new FoodItemNotFoundException("Food item not found!");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Restaurant restaurant = new Restaurant();

        // Menu
        restaurant.addFoodItem(new FoodItem(101, "Pizza", "Main", 250));
        restaurant.addFoodItem(new FoodItem(102, "Burger", "Starter", 120));
        restaurant.addFoodItem(new FoodItem(103, "Pasta", "Main", 200));
        restaurant.addFoodItem(new FoodItem(104, "Ice Cream", "Dessert", 80));

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Order order = new Order(1, name);

        int choice;

        do {
            System.out.println("\n1. Show Menu");
            System.out.println("2. Add Item");
            System.out.println("3. Remove Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Print Bill & Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    restaurant.displayMenu();
                    break;

                case 2:
                    try {
                        System.out.print("Enter Item ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        if (qty <= 0) {
                            throw new InvalidQuantityException("Quantity must be > 0");
                        }

                        FoodItem item = restaurant.findFoodItemById(id);
                        OrderItem orderItem = new OrderItem(item, qty);

                        order.addItem(orderItem);
                        System.out.println("Item added!");

                    } catch (FoodItemNotFoundException | InvalidQuantityException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter Item ID to remove: ");
                    int removeId = sc.nextInt();
                    order.removeItem(removeId);
                    System.out.println("Item removed!");
                    break;

                case 4:
                    System.out.print("Enter Item ID to update: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();

                    order.updateItem(updateId, newQty);
                    System.out.println("Quantity updated!");
                    break;

                case 5:
                    order.printBill();
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

    }
}
