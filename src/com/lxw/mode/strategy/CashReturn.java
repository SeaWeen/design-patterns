package com.lxw.mode.strategy;

/**
 * 返利策略
 * 
 * @author lanxw
 * @date 2018年8月24日 下午6:06:35
 */
public class CashReturn extends CashSuper {

	private double returnCondition = 0d;
	private double returnMoney = 0d;

	public CashReturn(String returnCondition, String returnMoney) {// 返利条件
		this.returnCondition = Double.parseDouble(returnCondition);
		this.returnMoney = Double.parseDouble(returnMoney);
	}

	@Override
	public double collectCash(double money) {
		// 实际缴费金额
		double payMoney = 0d;
		if (money >= returnCondition) {
			payMoney = money - Math.floor(money / returnCondition) * returnMoney;
		}
		return payMoney;
	}
}
