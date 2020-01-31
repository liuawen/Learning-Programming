package ZenofDesignPatterns.lod.section4;

/**
 * 业务场景
 */
public class Client {
	
	public static void main(String[] args) {
		InstallSoftware invoker = new InstallSoftware();
		invoker.installWizard(new Wizard());
	}
}
