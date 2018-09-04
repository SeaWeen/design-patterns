package com.lxw.mode.decorator;

/**
 * 具体服装装饰类-Tshirts类
 * @author lanxw
 * @date 2018年9月3日 下午4:17:47
 */
public class TShirtsDecorator extends FineryDecorator{

	@Override
	public void show() {
		super.show();//先执行component方法，相当于对component装饰
		tshirtShow();
	}
	
	/**
	 * Tshirt特有功能
	 */
	public void tshirtShow() {
		System.out.println("Tshirts");
	}
}
