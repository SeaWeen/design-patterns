package com.lxw.mode.decorator;

/**
 * concreteComponent类
 *  可以动态给这个对象添加职责
 * @author lanxw
 * @date 2018年9月4日 上午9:55:29
 */
public class Man implements Person{

	@Override
	public void show() {
		System.out.println("装扮人");
	}

}
