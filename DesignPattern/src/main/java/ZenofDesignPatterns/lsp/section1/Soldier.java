package ZenofDesignPatterns.lsp.section1;

/**
 * 士兵使用枪来杀人
 */
public class Soldier {
	//定义士兵的枪支
	private AbstractGun gun;
	//给士兵一支枪
	public void setGun(AbstractGun _gun){
		this.gun = _gun; 
	}
	public void killEnemy(){
		System.out.println("士兵开始杀人...");
		gun.shoot();
	}
}
