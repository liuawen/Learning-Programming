package ZenofDesignPatterns.prototype.section2;

/**
 * 原型模式通用代码
 */
public class PrototypeClass  implements Cloneable{
	
	//覆写父类Object方法
	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
		} catch (CloneNotSupportedException e) {
			//异常处理
		}
		return prototypeClass;
	}
}
