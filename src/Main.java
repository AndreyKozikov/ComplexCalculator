import Presenter.CalculatorPresenter;
import Presenter.Util.CalculatorHistory;
import View.CalculatorView;
import View.ConsoleCalculatorView;
import Module.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Calculator starting...");
        CalculatorView view = new ConsoleCalculatorView();
        CalculatorHistory history = CalculatorHistory.getInstance();
        CalculatorPresenter presenter = new CalculatorPresenter(view, history);

        presenter.start();
    }
}