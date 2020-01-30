package ZenofDesignPatterns.dip.section5;

/**
 *  司机的接口
 */
public interface IDriver {

	//车辆型号
	public void setCar(ICar car);
	
	//是司机就应该会驾驶汽车
	public void drive();
}
