package com.biprom.garage.UI;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = SubRealTimeView.VIEW_NAME)

public class SubRealTimeView extends SubRealTimeDesign implements View {
	
	public static final String VIEW_NAME = "SubRealTime";

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}

}
