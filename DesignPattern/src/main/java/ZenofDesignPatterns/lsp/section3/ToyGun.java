package ZenofDesignPatterns.lsp.section3;

/**
 *玩具枪
 */
public class ToyGun extends AbstractGun {

	//玩具枪式不能射击的，但是编译器又要求实现这个方法，怎么办？虚假一个呗！
	@Override
	public void shoot() {
		//玩具枪不能射击，这个方法就不能实现了
	}

}
