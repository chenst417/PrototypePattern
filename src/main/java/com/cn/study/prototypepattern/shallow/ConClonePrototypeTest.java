package com.cn.study.prototypepattern.shallow;

import java.util.ArrayList;
import java.util.List;

public class ConClonePrototypeTest {

	public static void main(String[] args) {
		
		ConClonePrototype prototype = new ConClonePrototype();
		prototype.age = 10;
		prototype.name = "Zhangsan";
		List<String> list = new ArrayList<String>();
		list.add("eating");
		prototype.list = list;
		
		ConClonePrototype a = (ConClonePrototype) prototype.clone();
		
		System.out.println(prototype);
		System.out.println(a);
		
		System.out.println(prototype.list);
		System.out.println(a.list);
		
		
	}
	
}
