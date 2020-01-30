package ZenofDesignPatterns.lsp.section2;

/**
 * 业务场景模拟类
 */
public class Client {
	
	public static void main(String[] args) {
		//产生三毛这个士兵
		Soldier sanMao = new Soldier();
		sanMao.setGun(new ToyGun());
		sanMao.killEnemy();
	}
}
