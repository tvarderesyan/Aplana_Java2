package Construcror;

/**
 * Created by Tsolak Varderesyan on 04.04.2018.
 */
public class Biscuit extends Staff {

    private String test2;

    public Biscuit(String name, Double price, Double weight, String test2) {
        super(name, price, weight);
        this.test2 = test2;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    @Override
    public String toString() {
        return "1. Biscuit: [" + super.toString() + ", test2 = " + test2 + "]";
    }
}