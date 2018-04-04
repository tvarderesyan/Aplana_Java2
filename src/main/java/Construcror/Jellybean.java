package Construcror;

/**
 * Created by MY on 09.12.2017.
 */
public class Jellybean extends Staff {

    private String test1;

    public Jellybean(String name, Double price, Double weight, String test1) {
        super(name, price, weight);
        this.test1 = test1;
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    @Override
    public String toString() {
        return "3. Jellybean: [" + super.toString() + ", test1 = " + test1 + "]";
    }
}