package ZenofDesignPatterns.factorys.section1;

/**
 *
 * 黑色人种，记得中学学英语，老师说black man是侮辱人的意思，不懂，没跟老外说话
 */
public class BlackHuman implements Human {

	public void getColor(){
		System.out.println("黑色人种的皮肤颜色是黑色的！");
	}

	public void talk() {
		System.out.println("黑人会说话，一般人听不懂。");

	}

}
