package com.lxw.mode.strategy;
/**
 * 上下文，维护strategy对象引用
 * @author lanxw
 * @date 2018年8月24日 下午5:56:44
 */
public class CashContext {
	
	private CashSuper csuper;

	public CashContext(CashSuper csuper) {
		this.csuper = csuper;
		
	}
	
	public double getResult(double money) {
		return csuper.collectCash(money);
	}
}
