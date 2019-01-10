package command;

/**
 * @author lwyan on 2018-11-29 10:49
 */
public class CommandPattern {
	public static void main(String[] args){
		//定义我们的接头人
		Invoker invoker = new Invoker();
		//客户要求增加一项需求
		System.out.println("------------客户要求增加一项需求---------------");
		//客户给我们下命令来
		Command addRequirementCommand = new AddRequirementCommand();
		//接头人接收到命令
		invoker.setCommand(addRequirementCommand);
		//接头人执行命令
		invoker.action();
		//客户要求删除一个页面
		System.out.println("------------客户要求删除一个页面---------------");
		Command deletePageCommand = new DeletePageCommand();
		invoker.setCommand(deletePageCommand);
		invoker.action();
	}
}