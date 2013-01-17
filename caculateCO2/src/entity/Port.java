package entity;

import java.io.Serializable;

public class Port implements Serializable{
	
	private static final long serialVersionUID = 3954772932476041286L;

	private String id;
	
	private int num; //port has a number

	private boolean isInputing; //True the port is importing type,or else is exporting.

	private double m_quantity﻿﻿﻿; //material's quantity of that port;

	private double c_percent;// carbon percentage of that port
	
	private double temperature; //temperature of that port
	
	private Device holder; //device has a one-to-many and double side relation with port
	
	
	public Port() {
		
	}
	
	public Device getHolder() {
		return holder;
	}
	
	public void setHolder(Device holder) {
		this.holder = holder;
	}
	
	public boolean getIsInputing() {
		return isInputing;
	}

	public void setIsInputing(boolean isInputing) {
		this.isInputing = isInputing;
	}

	public double getM_quantity﻿﻿﻿() {
		return m_quantity﻿﻿﻿;
	}

	public void setM_quantity﻿﻿﻿(double m_quantity﻿﻿﻿) {
		this.m_quantity﻿﻿﻿ = m_quantity﻿﻿﻿;
	}

	public double getC_percent() {
		return c_percent;
	}

	public void setC_percent(double c_percent) {
		this.c_percent = c_percent;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
