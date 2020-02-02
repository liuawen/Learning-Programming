package ZenofDesignPatterns.factorys.section4;

/**
 *
 */
public class BlackHumanFactory extends AbstractHumanFactory {

	public Human createHuman() {
		return new BlackHuman();
	}
}
