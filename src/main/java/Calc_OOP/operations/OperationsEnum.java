package Calc_OOP.operations;

/**
 * Created by MY on 10.04.2018.
 */
public enum OperationsEnum {
    Сумма('+'),
    Разность('-'),
    Умножение('*'),
    Деление('/');

    private final Character sign;

    OperationsEnum(Character value) {
        sign = value;
    }

    public static OperationsEnum getOperationEnumFromString(String operationEnumStr) {
        for (OperationsEnum operationsEnum : OperationsEnum.values()) {
            if (operationsEnum.name().equalsIgnoreCase(operationEnumStr)) {
                return operationsEnum;
            }
        }
        System.out.println(String.format("Неизвестна операция \"%s\". Используйте: %s", operationEnumStr, OperationsEnum.valuesToString()));
        return null;
    }

    public static String valuesToString() {
        String values = "";
        for (OperationsEnum operationsEnum : OperationsEnum.values()) {
            values += String.format("\"%s\" (%s) ", operationsEnum.toString(), operationsEnum.sign);
        }
        return values;
    }

    public Character getValue() {
        return sign;
    }
}