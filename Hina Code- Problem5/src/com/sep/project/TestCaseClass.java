package com.sep.project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCaseClass {

	MainRunner main;
	@Before
	public void setUp() throws Exception {
		MainRunner main=new MainRunner();
	}
	
	@Test
	public void testCalculatePositiveX()
	{
		assertEquals((int)512.0, (int)main.calculatePositiveX(2, -3.0));
		
	}
	
	@Test
	public void testCalcDecValues()
	{
		MainRunner main=new MainRunner();
		assertEquals((int)0.027393928791126097, (int)main.calcDecValues(1.5));
	}
	
	@Test
	public void testcalculateNegativeX(){
		
		assertEquals((int)0.037037037037037035, (int)main.calculateNegativeX(-3, -3));
	}
	
	@Test
	public void testCalculateFractionalPowers() {
		MainRunner main=new MainRunner();
		assertEquals((int)2.928171391891253, (int)main.calcFraction(2, 5));
	}
	
	@Test
	public void testNegCalculateFractionalPowers() {
		MainRunner main=new MainRunner();
		assertEquals((int)1.3947436, (int)main.calcNegFraction(-2, 3));
	}
	
	@Test
	public void testcalculateNegDecimal() {
		MainRunner main=new MainRunner();
		assertEquals((int)1.1407637158734933, (int)main.calculateNegDecimal(-1.5));
	}
	

	@After
	public void tearDown() throws Exception {
	}




}
