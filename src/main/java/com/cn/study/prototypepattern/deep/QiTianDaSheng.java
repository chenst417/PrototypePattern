package com.cn.study.prototypepattern.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JinGuBang jinGuBang;
	
	public QiTianDaSheng() {
		this.jinGuBang = new JinGuBang();
		this.date = new Date();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this.deep();
	}

	private Object deep() {
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			oos.flush();
			oos.close();
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			QiTianDaSheng q = (QiTianDaSheng) ois.readObject();
			q.date = new Date();
			return q;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
