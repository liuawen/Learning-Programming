package ZenofDesignPatterns.lsp.section5;

import java.util.Collection;
import java.util.HashMap;

/**
 * 子类
 */
public class Son extends Father {

	//缩小输入参数范围
	public Collection<?> doSomething(HashMap<?, ?> map){
		System.out.println("子类被执行...");
		return map.values();
	}
}
