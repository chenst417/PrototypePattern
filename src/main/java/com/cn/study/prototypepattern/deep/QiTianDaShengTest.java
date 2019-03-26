package com.cn.study.prototypepattern.deep;

public class QiTianDaShengTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		QiTianDaSheng q = new QiTianDaSheng();
		
		
		QiTianDaSheng a = (QiTianDaSheng) q.clone();
		
		System.out.println(q);
		System.out.println(a);
		
		
		System.err.println(q.jinGuBang);
		System.err.println(a.jinGuBang);
	}
	
}
