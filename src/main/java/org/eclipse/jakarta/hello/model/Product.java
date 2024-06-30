package org.eclipse.jakarta.hello.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class Product {

    private int id;
    @NotBlank(message = "Name must not be blank")
    @Size(min = 5, max = 50)
    private String name;

    @NotBlank(message = "Price must not be blank")
    @PositiveOrZero(message = "Price must be zero or a positive number")
    private double Price;

    @PositiveOrZero(message = "Quantity must be zero or a positive number")
    private double Quantity;

    private boolean stock;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }
}
