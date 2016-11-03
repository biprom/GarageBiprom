package com.biprom.garage.UI;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = VideoView.VIEW_NAME)

public class VideoView extends VideoDesign implements View {
	
	public static final String VIEW_NAME = "VideoView";

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
	

}
