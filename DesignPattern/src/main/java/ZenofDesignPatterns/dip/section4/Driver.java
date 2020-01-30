package ZenofDesignPatterns.dip.section4;

/**
 *  司机
 */
public class Driver implements IDriver{
	private ICar car;
	
	//构造函数注入
	public Driver(ICar _car){
		this.car = _car;
	}
	
	//司机的主要职责就是驾驶汽车
	@Override
	public void drive(){
		this.car.run();
	}
}
