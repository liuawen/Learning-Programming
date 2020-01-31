package ZenofDesignPatterns.lod.section1;

/**
 *  我们使用Client来描绘一下这个场景
 */
public class Client {

	public static void main(String[] args) {
		Teacher teacher= new Teacher();
		
		//老师发布命令
		teacher.commond(new GroupLeader());
	}
	
}
