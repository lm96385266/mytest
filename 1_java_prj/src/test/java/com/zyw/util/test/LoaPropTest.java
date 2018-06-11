package com.zyw.util.test;

import org.junit.Test;

import com.zyw.util.LoadPorp;

public class LoaPropTest {

	@Test
	public void testMsg(){
		String msg = new LoadPorp().getProperty("msg"); 
		System.out.println(msg);
	}
}
