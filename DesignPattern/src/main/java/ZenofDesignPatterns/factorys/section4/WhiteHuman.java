package ZenofDesignPatterns.factorys.section4;

/**
 *  白色人人种
 */
public class WhiteHuman implements Human {
	
	//白色人种的颜色是白色的
	public void getColor(){
		System.out.println("白色人种的皮肤颜色是白色的！");
	}
	
	//白色人种讲话
	public void talk() {
		System.out.println("白色人种会说话，一般都是但是单字节。");

	}
	
}
