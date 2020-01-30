package ZenofDesignPatterns.lsp.section3;

/**
 * 士兵使用枪来杀人
 */
public class Soldier {
	
	public void killEnemy(AbstractGun gun){
		System.out.println("士兵开始杀人...");
		gun.shoot();
	}
}
