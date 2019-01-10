package command;

/**
 * @author lwyan on 2018-11-29 10:42
 */
public abstract class Group {
	//找到这个组
	public abstract void find();
	//被要求增加功能
	public abstract void add();
	//被要求删除功能
	public abstract void delete();
	//被要求给出所有的变更计划
	public abstract void plan();
}