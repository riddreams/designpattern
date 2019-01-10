package command;

/**
 * @author lwyan on 2018-11-29 10:40
 */
public class AddRequirementCommand extends Command{
	@Override
	//执行增加一项需求的命令
	public void execute() {
		//找到需求组
		super.rg.find();
		//增加一份需求
		super.rg.add();
		//给出计划
		super.rg.plan();
	}
}