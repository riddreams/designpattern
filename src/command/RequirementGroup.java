package command;

/**
 * @author lwyan on 2018-11-29 10:39
 */
public class RequirementGroup extends Group{
	@Override
	public void find() {
		System.out.println("找到需求组...");
	}

	@Override
	public void add() {
		System.out.println("客户要求增加一项需求...");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一项需求...");
	}

	@Override
	public void plan() {
		System.out.println("客户要求需求变更计划...");
	}
}