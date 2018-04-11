package Calc_OOP.operations;

import static Calc_OOP.operations.OperationsEnum.Разность;

/**
 * Created by MY on 10.04.2018.
 */
public class OperationSubtract extends Operation {

    public OperationSubtract() {
        super();
        this.operation = Разность;
    }

    @Override
    public Float countResult(Float one, Float two) {
        return one - two;
    }
}