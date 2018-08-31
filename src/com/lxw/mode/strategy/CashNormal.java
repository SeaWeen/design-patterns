package com.lxw.mode.strategy;

/**
 * 正常收费策略
 * @author lanxw
 * @date 2018年8月24日 下午6:00:20
 */
public class CashNormal extends CashSuper {

	@Override
	public double collectCash(double money) {
		return money;
	}

}
