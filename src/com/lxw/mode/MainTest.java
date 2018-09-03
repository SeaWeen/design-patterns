package com.lxw.mode;

import org.junit.Test;

import com.lxw.mode.factory.Operation;
import com.lxw.mode.factory.OperationFactory;
import com.lxw.mode.strategy.CashContext;
import com.lxw.mode.strategy.CashNormal;
import com.lxw.mode.strategy.CashReturn;

public class MainTest {

	@Test
	public void factoryTest() {
		Operation operation = OperationFactory.createOperation("/");
		double result = operation.getResult(9, 4);
		System.out.println(result);
	}

	@Test
	public void strategyTest() {
		String type = "满300返100";
		CashContext context = new CashContext(type);
		double result = context.getResult(600);
		System.out.println("实际收费金额："+result);
		
		
	}
}
