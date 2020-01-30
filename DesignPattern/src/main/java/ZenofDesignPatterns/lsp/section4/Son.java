package ZenofDesignPatterns.lsp.section4;

import java.util.Collection;
import java.util.Map;

/**
 *子类
 */
public class Son extends Father {

	//放大输入参数类型
	public Collection<?> doSomething(Map<?, ?> map){
		System.out.println("子类被执行...");
		return map.values();
	}
}
