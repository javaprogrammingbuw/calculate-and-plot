import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  //Todo
	@Test public static void test0() {
		//define
		Calculate cal = new Calculate();
		double actual=cal.propX(1);
		double expected = 4;
		//test
		assertEquals(expected,actual, 0.1);
	}
	@Test public static void test1() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.weightTotal(1,inpVal);
		double expected = 559.7;
		//test
		assertEquals(expected,actual, 0.1);
	}
	@Test public static void test2() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.weightTop(inpVal);
		double expected = 128.3;

		//test
		assertEquals(expected,actual,0.1);
	}
	@Test public static void test3() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.weightBot(inpVal);
		double expected = 145.8;

		//test
		assertEquals(expected,actual, 0.1);
	}
	@Test public static void test4() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.weightMid(1,inpVal);
		double expected = 285.6;

		//test
		assertEquals(expected,actual, 0.1);
	}
	@Test public static void test5() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.baseShear(1,inpVal);
		double expected = 460.697029;

		//test
		assertEquals(expected,actual, 0.1);
	}
	@Test public static void test6() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.timePeriod(1,inpVal);
		double expected = 0.485959288;

		//test
		assertEquals(expected,actual,0.1);
	}
	@Test public static void test7() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual []=cal.fXmid(1,inpVal);
		double actual1=actual[0];
		double actual2=actual[1];
		double expected1 = 97.21;
		double expected2 = 142.08;

		//test
		assertEquals(expected1 ,actual1,0.1);
		assertEquals(expected2 ,actual2,0.1);
	}
	@Test public static void test8() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual []=cal.fXtg(1,inpVal);
		double actual1=actual[0];
		double actual2=actual[1];
		double expected1 = 53.44;
		double expected2 = 167.96;
		//test
		assertEquals(expected1 ,actual1,1);
		assertEquals(expected2 ,actual2,1);
	}
	@Test public static void test9() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.heightCal(1,inpVal);
		double expected = 12.5;

		//test
		assertEquals(expected,actual,0.001);
	}
	
	@Test public static void test10() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.propZ(9);
		double expected = 5.0;

		//test
		assertEquals(expected,actual,0.001);
	}
	@Test public static void test11() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual []=cal.fXtg(4,inpVal);
		double actual1=actual[0];
		double actual2=actual[1];

		
		double expected1 = 21.50440961;
		double expected2 = 116.2430701;
		//test
		assertEquals(expected1 ,actual1,1);
		assertEquals(expected2 ,actual2,1);
	}
	@Test public static void test12() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual []=cal.fXmid(4,inpVal);
		double actual1=actual[0];
		double actual2=actual[1];
		double actual3=actual[2];
		double actual4=actual[3];
		double actual5=actual[4];
		
		double expected1 = 39.11501665;
		double expected2 = 57.16810126;
		double expected3 = 75.22118586;
		double expected4 = 93.27427047;
		double expected5 = 111.3273551;
		//test
		assertEquals(expected1 ,actual1,1);
		assertEquals(expected2 ,actual2,1);
		assertEquals(expected3 ,actual3,1);
		assertEquals(expected4 ,actual4,1);
		assertEquals(expected5 ,actual5,1);
	}
	@Test public static void test13() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.heightCal(4,inpVal);
		double expected = 21.5;

		//test
		assertEquals(expected,actual,0.001);
	}
	@Test public static void test14() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.weightTotal(4,inpVal);
		double expected = 988.1;

		//test
		assertEquals(expected,actual,1);
	}
	@Test public static void test15() {
		//define
		Calculate cal = new Calculate();
		double  [] inpVal=  {6,4,11.04,10.68,10.68,6,12,13,0.4,0.4,1,1,1,1,3,3,3.5,0.0731};
		double actual=cal.propZ(2);
		double expected = 3.0;

		//test
		assertEquals(expected,actual,0.001);
	}
	@Test public static void test16() {
		//define
		Calculate cal = new Calculate();
		double actual=cal.propX(0);
		double expected = 3;
		//test
		assertEquals(expected,actual, 0.001);
	}
	
	
	
}
