package com.stargazer.form;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.stargazer.witchatelier.util.system.IDUtil;

public class Form {
	public Form(String fileTitle,String resultFileName,List<DataForm> list) {
		File file = new File(fileTitle);
		DataForm dataForm;
		if(file.isDirectory()||file.exists()==Boolean.FALSE){
			System.out.println("Stargazer Error : 原文件不存在");
		}
		else{
			FileInputStream fileInputStream = null;
			BufferedImage bi = null;
			try {
				fileInputStream = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				System.out.println("Stargazer Error : 原文件不存在");
			}
			try {
				bi = ImageIO.read(fileInputStream);
			} catch (IOException e) {
				System.out.println("Stargazer Error : "+e.getMessage());
			}
			Graphics2D g2 = (Graphics2D)bi.getGraphics();   
	        g2.setPaint(Color.white);
	        int num = list.size();
	        for(int i=0;i<num;i++){
	          	dataForm = list.get(i);
		        g2.drawLine(dataForm.getPointStartX(), dataForm.getPointStartY(),
		        		        dataForm.getPointEndX(), dataForm.getPointEndY());
	        }
	        try {
	          	File resultFile = new File(resultFileName);
				ImageIO.write(bi,"png",resultFile);
			} catch (IOException e) {
				System.out.println("Stargazer Error : "+e.getMessage());
			} 

		}
	}
}
