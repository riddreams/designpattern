package strategy;

/**
 * @author lwyan on 2018-06-05 9:39
 */
public class OperationMul implements Strategy{
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}