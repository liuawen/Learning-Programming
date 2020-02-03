package ZenofDesignPatterns.template_method.game;

/**
 *  客户开始使用这个模型
 */
public class Client {

	public static void main(String[] args) {
		GameModel slto = new SltoModel();
		slto.run();
		
		GameModel pck3 = new Pck3Model();
		pck3.run();
	}
}
