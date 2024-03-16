package Presenter.Util;

import Module.ComplexOperations.impl.ComplexOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorHistory {
    private static CalculatorHistory instance;
    private static List<String> history;

    private CalculatorHistory() {
        history = new ArrayList<>();
    }

    public static CalculatorHistory getInstance() {
        if (instance == null) {
            instance = new CalculatorHistory();
        }
        return instance;
    }

    public void addEntry(String entry) {
        history.add(entry);
    }

    public static List<String> getHistory() {
        return Collections.unmodifiableList(history);
    }
}
