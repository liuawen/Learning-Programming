package ZenofDesignPatterns.dip.section2;

/**
 * 业务场景类
 */
public class Client {
	public static void main(String[] args) {
		IDriver zhangSan = new Driver();
		//ICar benz = new Benz();
		ICar bmw = new BMW();
		ICar benz = new Benz();
		//张三开奔驰车
		zhangSan.drive(benz);
		System.out.println("奔驰车坏了，我换车开了");
		//我是张三，我想开宝马车了
		zhangSan.drive(bmw);
	}
}
