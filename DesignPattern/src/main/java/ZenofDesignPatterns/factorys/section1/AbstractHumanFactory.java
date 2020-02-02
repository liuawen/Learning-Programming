package ZenofDesignPatterns.factorys.section1;

/**
 *
 */
public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);
	
}