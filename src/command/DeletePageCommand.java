package command;

/**
 * @author lwyan on 2018-11-29 10:41
 */
public class DeletePageCommand extends Command{
	//执行删除一个页面的命令
	public void execute() {
		//找到页面组
		super.pg.find();
		//删除一个页面
		super.pg.delete();
		//给出计划
		super.pg.plan();
	}
}