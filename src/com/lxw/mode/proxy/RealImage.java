package com.lxw.mode.proxy;

/**
 * 代理真实类
 * @author lanxw
 * @date 2018年9月4日 上午11:14:43
 */
public class RealImage implements Image{

	@Override
	public void display() {
		System.out.println("图片展示");
	}
}
