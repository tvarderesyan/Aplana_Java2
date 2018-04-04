package Construcror;

/**
 * Created by Tsolak Varderesyan on 04.04.2018.
 */
public abstract class Staff {
    public String name;
    public Double price;
    public  Double weight;

    public Staff(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "name = " + name + " , price = " + price + " , weight = " + weight;
    }
}