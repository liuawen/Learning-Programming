package ZenofDesignPatterns.lsp.section3;

/**
 * 狙击步枪
 */
public class AUG extends Rifle {
	
	//狙击枪都是携带一个精准的望远镜
	public void zoomOut(){
		System.out.println("通过望远镜观看敌人...");
	}
	
	@Override
	public void shoot(){
		System.out.println("AUG射击...");
	}
}
