package Module.ComplexOperations;

import Module.ComplexOperations.impl.ComplexOperations;
import Presenter.Util.CalculatorHistory;
import Presenter.Util.Operations;

import java.util.HashMap;
import java.util.Map;

public class OperationsList {

    private static final Map<Integer, ComplexOperations> operationMap = new HashMap<>();

    static {
        operationMap.put(1, new Additional());
        operationMap.put(2, new Subtraction());
        operationMap.put(3, new Multiplication());
        operationMap.put(4, new Division());
    }
    public static ComplexOperations getOperation(Integer operation) {
        return operationMap.get(operation);
    }
}

