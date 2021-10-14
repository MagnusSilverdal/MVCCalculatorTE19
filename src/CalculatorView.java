import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is a class
 * Created 2021-10-14
 *
 * @author Magnus Silverdal
 */
public class CalculatorView {
    private JTextField firstNumber;
    private JTextField secondNumber;
    private JTextField result;
    private JButton calculateButton;
    private JPanel calculatorPanel;

    public CalculatorView() {

    }

    public JPanel getPanel() {
        return calculatorPanel;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public void setResult(int result) {
        this.result.setText("" + result);
    }
}
