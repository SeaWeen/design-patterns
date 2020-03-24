package com.lxw.mode.strategy;
/**
 * 上下文，维护strategy对象引用
 * @author lanxw
 * @date 2018年8月24日 下午5:56:44
 */
public class CashContext {
	
	private CashSuper csuper;

	public CashContext(String type) {
		switch (type) {
		case "满300返100":
			this.csuper = new CashReturn("300", "100");
			break;
		case "正常收费":
			this.csuper = new CashNormal();
			break;
		default :
			this.csuper = new CashNormal();
		}
		//master 分支
        // fe那只
		// 主干
	}
	
	public double getResult(double money) {
		return csuper.collectCash(money);
	}
}
