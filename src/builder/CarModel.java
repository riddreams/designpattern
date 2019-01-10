package builder;

import java.util.ArrayList;

/**
 * 类似模板方法模式
 * @author lwyan on 2018-11-28 10:59
 */
public abstract class CarModel {
	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<>();
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	// 模板方法
	final public void run() {
		//循环一遍， 谁在前， 就先执行谁
		for (String actionName : this.sequence) {
			if (actionName.equalsIgnoreCase("start")) {
				this.start(); //启动汽车
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop(); //停止汽车
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm(); //喇叭开始叫了
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom(); //引擎开始轰鸣
			}
		}
	}
	// 钩子，把传递过来的值传递到类内
	final public void setSequence(ArrayList<String> sequence){
		this.sequence = sequence;
	}
}