package ZenofDesignPatterns.lsp.section3;

/**
 *  业务场景模拟类
 */
public class Client {
	
	public static void main(String[] args) {
		//产生三毛这个狙击手
		Snipper sanMao = new Snipper();
		//sanMao.setRifle((AUG)(new Rifle()));	//	java.lang.ClassCastException
		sanMao.setRifle(new AUG());
		sanMao.killEnemy();
	}
}
