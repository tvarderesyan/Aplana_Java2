package Calc_OOP.operations;

import static Calc_OOP.operations.OperationsEnum.Сумма;

/**
 * Created by MY on 10.04.2018.
 */
public class OperationSum extends Operation {

    public OperationSum() {
        super();
        this.operation = Сумма;
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one + two;
    }
}
