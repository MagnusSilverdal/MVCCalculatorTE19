/**
 * This is a class
 * Created 2021-10-14
 *
 * @author Magnus Silverdal
 */
public class CalculatorModel {
    private int result;

    public CalculatorModel() {

    }

    public void addNumbers(int a, int b) {
        result = a+b;
    }

    public int getResult() {
        return result;
    }
}
