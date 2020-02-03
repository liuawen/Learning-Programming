package ZenofDesignPatterns.template_method.section1;

/**
 *
 * 客户开始使用这个模型
 */
public class Client {

	public static void main(String[] args) {
		//牛叉公司要H1型号的悍马
		HummerH1Model h1 = new HummerH1Model();
		
		//H1模型演示
		h1.start();
		h1.engineBoom();
		h1.run();
		h1.alarm();
		h1.run(); 
		h1.stop();

	}

}
