package Calc_OOP.operations;

import static Calc_OOP.operations.OperationsEnum.Деление;

/**
 * Created by MY on 10.04.2018.
 */
public class OperationDivision extends Operation {

    public OperationDivision() {
        super();
        this.operation = Деление;
    }

    @Override // fixme не получится обрабатывать тут исключения тк float их не даст, будет получаться бесконечность
    public Float countResult(Float one, Float two) {
        if (two != 0f)
            return one / two;
        else
            System.out.println("Деление на ноль");
        return null;
    }
}