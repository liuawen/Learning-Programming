package ZenofDesignPatterns.factorys.section4;

/**
 *
 */
public class YellowHumanFactory extends AbstractHumanFactory {

	public Human createHuman() {
		return new WhiteHuman();
	}
}
