package strategy;

/**
 * @author lwyan on 2018-06-05 9:41
 */
public class StrategyPattern {
	public static void main(String[] args){
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = "+context.executeStrategy(10,5));

		context = new Context(new OperationSub());
		System.out.println("10 - 5 = "+context.executeStrategy(10,5));

		context = new Context(new OperationMul());
		System.out.println("10 * 5 = "+context.executeStrategy(10,5));
	}
}