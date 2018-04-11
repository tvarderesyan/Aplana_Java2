package Calc_OOP.operations;

import static Calc_OOP.operations.OperationsEnum.Умножение;

/**
 * Created by MY on 10.04.2018.
 */
public class OperationMultiply extends Operation {

    public OperationMultiply() {
        super();
        this.operation = Умножение;
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one * two;
    }
}