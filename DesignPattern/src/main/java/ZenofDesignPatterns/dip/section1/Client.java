package ZenofDesignPatterns.dip.section1;

/**
 * 业务场景类
 */
public class Client {
	public static void main(String[] args) {
		Driver zhangSan = new Driver();
		Benz benz = new Benz();
		
		//张三开奔驰车
		zhangSan.drive(benz);

		//张三想开宝马车呢？要去修改Driver类   不可取
	}
}
