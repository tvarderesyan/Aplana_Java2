package Construcror;

/**
 * Created by Tsolak Varderesyan on 04.04.2018.
 */
public class Waffles extends Staff {
    private String test3;

    public Waffles(String name, Double price, Double weight, String test3) {
        super(name, price, weight);
        this.test3 = test3;
    }


    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }

    @Override
    public String toString() {
        return "4. Waffles: [" + super.toString() + ", test3 = " + test3 + "]";
    }
}