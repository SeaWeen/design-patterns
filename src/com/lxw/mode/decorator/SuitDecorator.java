package com.lxw.mode.decorator;

/**
 * 具体装饰-西装类
 * @author lanxw
 * @date 2018年9月3日 下午5:25:12
 */
public class SuitDecorator extends FineryDecorator{

	@Override
	public void show() {
		super.show();//先执行component方法，相当于对component装饰
		suitShow();
	}
	
	/**
	 * 西装类特有功能
	 */
	public void suitShow() {
		System.out.println("西装");
	}
}
