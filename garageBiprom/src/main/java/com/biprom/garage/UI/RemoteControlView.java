package com.biprom.garage.UI;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = RemoteControlView.VIEW_NAME)

public class RemoteControlView extends RemoteControl implements View {
	
	public static final String VIEW_NAME = "RemoteControlDesign";

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
