package com.lxw.mode;

import org.junit.Test;

import com.lxw.mode.factory.Operation;
import com.lxw.mode.factory.OperationFactory;

public class MainTest {
	
	@Test
	public void factoryTest() {
		Operation operation = OperationFactory.createOperation("/");
		double result = operation.getResult(9, 4);
		System.out.println(result);
	}
}
