import Calc_OOP.Calculator;
import Calc_OOP.NumberForCalcs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by MY on 10.04.2018.
 */
public class Task8 extends NumberForCalcs {


    Calculator calculator = new Calculator();


    @Test
    public void test1() {
System.out.println("-----Test1-----");
        calculator.setFirstNumber("12.59");
        calculator.setSecondNumber("23,46");
        calculator.setOperation("сумма");
        calculator.calculate();
    }

    @Test
    public void test2() {
        System.out.println("-----Test2-----");
        calculator.setFirstNumber("10.54");
        calculator.setSecondNumber("");
        calculator.setOperation("сумма");
        calculator.calculate();
    }

    @Test
    public void test3() {

        System.out.println("-----Test3-----");
        calculator.setFirstNumber("5.54");
        calculator.setSecondNumber("7,46");
        calculator.setOperation("сума");
        calculator.calculate();
    }

    @Test
    public void test4() {
        System.out.println("-----Test4-----");
        calculator.setFirstNumber("1.54");
        calculator.setSecondNumber("");
        calculator.setOperation("сумма");
        calculator.calculate();
    }

    @Test
    public void test5() {
        System.out.println("-----Test5-----");
        calculator.setFirstNumber("");
        calculator.setSecondNumber("");
        calculator.setOperation("");
        calculator.calculate();
    }

    @Test
    public void test6() {
        System.out.println("-----Test6-----");
        calculator.setFirstNumber("sda");
        calculator.setSecondNumber("87,46");
        calculator.setOperation("сумма");
        calculator.calculate();
    }

    @Test
    public void test7() {
        System.out.println("-----Test7-----");
        calculator.setFirstNumber("65.54");
        calculator.setSecondNumber("34,46");
        calculator.setOperation("разность");
        calculator.calculate();
    }

    @Test
    public void test8() {
        System.out.println("-----Test8-----");
        calculator.setFirstNumber("87.54");
        calculator.setSecondNumber("100,46");
        calculator.setOperation("разность");
        calculator.calculate();
    }

    @Test
    public void test9() {
        System.out.println("-----Test9-----");
        calculator.setFirstNumber("2");
        calculator.setSecondNumber("5");
        calculator.setOperation("умножение");
        calculator.calculate();
    }

      @Test
    public void test10() {
          System.out.println("-----Test10-----");
        calculator.setFirstNumber("15.00");
        calculator.setSecondNumber("5,46");
        calculator.setOperation("деление");
        calculator.calculate();
    }

    @Test
    public void test11() {
        System.out.println("-----Test11-----");
        calculator.setFirstNumber("14.67");
        calculator.setSecondNumber("0.00");
        calculator.setOperation("деление");
        calculator.calculate();
    }

  }
