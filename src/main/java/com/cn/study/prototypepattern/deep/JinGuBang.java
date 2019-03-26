package com.cn.study.prototypepattern.deep;

import java.io.Serializable;

/**
 * 孙悟空的金箍棒
 * @author User
 *
 */
public class JinGuBang implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public double h = 100;
	public double w = 10;

	public void big() {
		h*=2;
		w*=2;
	}

	public void smail() {
		h/=2;
		w/=2;
	}
}
