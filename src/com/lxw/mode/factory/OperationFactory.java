package com.lxw.mode.factory;
/**
 * 运算工厂类
 * @author lanxw
 * @date 2018年8月24日 下午5:28:31
 */
public class OperationFactory {

	public static Operation createOperation(String operate) {
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new OperationAdd();break;
		case "-":
			operation = new OperationSub();break;
		case "*":
			operation = new OperationMul();break;
		case "/":
			operation = new OperationDiv();break;
		}
		
		return operation;
	}
}
