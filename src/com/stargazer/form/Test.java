package com.stargazer.form;

import java.util.ArrayList;
import java.util.List;

import com.stargazer.witchatelier.util.system.IDUtil;

public class Test {
	public static void main(String[] args) {
		List<DataForm> list = new ArrayList<DataForm>();
		
		for(int i=1;i<10;i++){
			DataForm d = new DataForm(142+i,446,142+i,597);
			list.add(d);
		}
		
		for(int i=1;i<1000;i++){
			int x = (int)(Math.random()*3296);
			DataForm d = new DataForm(142+x,446,142+x,597);
			list.add(d);
		}
		Form form = new Form(System.getProperty("user.dir") + "/DataForm/DataFormTemple.png",System.getProperty("user.dir") + "/DataForm/"+IDUtil.ID()+".png",list);
	}
}
