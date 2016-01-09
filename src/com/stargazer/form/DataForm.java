package com.stargazer.form;

import org.apache.commons.lang.Validate;


/**
 * 数据表格领域模型
 * @author felixsion
 * **/
public class DataForm {
	private int pointStartX;
	private int pointStartY;
	private int pointEndX;
	private int pointEndY;
	
	/**初始化**/
	public DataForm(int pointStartX,int pointStartY,int pointEndX,int pointEndY) {
		Validate.notNull(pointStartX,"Stargazer Error :  pointStartX is null");
		Validate.notNull(pointStartY,"Stargazer Error :  pointStarty is null");
		Validate.notNull(pointEndX,  "Stargazer Error :  pointEndX is null");
		Validate.notNull(pointEndY,  "Stargazer Error :  pointEndy is null");
		this.pointStartX = pointStartX;
		this.pointStartY = pointStartY;
		this.pointEndX   = pointEndX;
		this.pointEndY   = pointEndY;
	}

	public int getPointStartX() {
		return pointStartX;
	}
	public int getPointStartY() {
		return pointStartY;
	}
	public int getPointEndX() {
		return pointEndX;
	}
	public int getPointEndY() {
		return pointEndY;
	}
	
}
