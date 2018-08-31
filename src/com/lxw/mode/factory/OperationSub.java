package com.lxw.mode.factory;
/**
 * 减法运算类
 * @author lanxw
 * @date 2018年8月24日 下午5:00:53
 */
public class OperationSub implements Operation{
	
	@Override
	public double getResult(double numberA,double numberB) {
		double result = numberA - numberB;
		return result;
	}

	
}
