package Module.ComplexOperations;

import Module.ComplexOperations.impl.ComplexOperations;
import Presenter.Util.CalculatorHistory;
import Presenter.Util.Operations;

import java.util.HashMap;
import java.util.Map;

public class OperationsList {

    private static final Map<Operations, ComplexOperations> operationMap = new HashMap<>();

    static {
        operationMap.put(Operations.ADDITIONAL, new Additional());
        operationMap.put(Operations.SUBTRACTION, new Subtraction());
        operationMap.put(Operations.MULTIPLICATION, new Multiplication());
        operationMap.put(Operations.DIVISION, new Division());
    }
    public static ComplexOperations getOperation(Operations operation) {
        return operationMap.get(operation);
    }
}

