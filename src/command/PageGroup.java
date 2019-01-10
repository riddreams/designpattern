package command;

/**
 * @author lwyan on 2018-11-29 10:39
 */
public class PageGroup extends Group{
	@Override
	public void find() {
		System.out.println("找到美工组...");
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一个页面...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个页面...");
	}

	@Override
	public void plan() {
		System.out.println("客户要求页面变更计划...");
	}
}