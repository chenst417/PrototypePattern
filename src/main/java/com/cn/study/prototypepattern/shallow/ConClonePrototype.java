package com.cn.study.prototypepattern.shallow;

import java.util.List;

public class ConClonePrototype  implements Prototype {

	public int age;
	public String name;
	public List<String> list;
	
	
	public Prototype clone() {
		ConClonePrototype prototype = new ConClonePrototype();
		prototype.age = this.age;
		prototype.name = this.name;
		prototype.list = this.list;
		return prototype;
	}

}
