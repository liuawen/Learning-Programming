package ZenofDesignPatterns.factorys.section2;

/**
 *
 */
public class Client {
	private static Creator creator;
	private static Product product;
	
	public static void main(String[] args) {
		creator = new ConcreteCreator();
		product = creator.createProduct(ConcreteProduct1.class);
		/*
		 * 继续业务处理
		 */
	}
}
