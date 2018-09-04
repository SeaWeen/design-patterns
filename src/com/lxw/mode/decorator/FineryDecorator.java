package com.lxw.mode.decorator;

/**
 * 服装装饰类()
 * @author lanxw
 * @date 2018年9月3日 下午4:08:04
 */
public abstract class FineryDecorator implements Person{

	private Person component;
	
	public void setComponent(Person component) {
		this.component = component;
	}
	
	@Override
	public void show() {
		component.show();
	}
}
