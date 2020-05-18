package entities;

// para poder usar o max na PROGRAM implementar o Comparable aqui
public class Product implements Comparable<Product>{ // poderia ser T, mas fica mais legível como Product
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f",price);
    }

    @Override
    public int compareTo(Product other) { // poderia ser o, mas ficou mais legível
        return price.compareTo(other.getPrice());
    }
}
