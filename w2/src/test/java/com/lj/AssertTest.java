package com.lj;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class AssertTest {
	@Test
	public void fun1Test(){
		 try {
			AsserUitls.isTrue(true, "�ⲻ�����");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void fun2Test(){
		 try {
			AsserUitls.isFalse(true, "�ⲻ�Ǽٵĵ�");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		 try {
			AsserUitls.isNotNull("�ȵ�", "�ǿ�");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test(){
		 try {
			AsserUitls.isNull("�ȵ�", "��Ϊ��");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun5Test(){
		 try {
			 ArrayList<Integer> arrayList = new ArrayList<Integer>();
			AsserUitls.collectionNotNull(arrayList, "����Ϊ��");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void fun6Test(){
		 try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			AsserUitls.mapNotNull(hashMap, "����Ϊ��");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void fun7Test(){
		 try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			AsserUitls.hhs("    22", "�ַ���Ϊ��");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun8Test(){
		 try {
			HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			AsserUitls.Num(-1, "����������");
		} catch (WRuntimeException e) {
			e.printStackTrace();
		}
	}
}
