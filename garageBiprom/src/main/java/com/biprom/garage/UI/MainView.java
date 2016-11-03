package com.biprom.garage.UI;

import com.vaadin.event.ItemClickEvent;
import com.vaadin.event.ItemClickEvent.ItemClickListener;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.UI;

@SpringView(name = MainView.VIEW_NAME)

public class MainView extends MainDesign implements View{
	
	public static final String VIEW_NAME = "mainview";
	
	Navigator subnavigator ;
	
	
	
	
	public MainView(SpringViewProvider provider){
		
		
		
		mainMenu.addItem("Online temperature");
		mainMenu.setChildrenAllowed("Online temperature", false);
		mainMenu.addItem("History temperature");
		mainMenu.setChildrenAllowed("History temperature", false);
		mainMenu.addItem("Video");
		mainMenu.setChildrenAllowed("Video", false);
		mainMenu.addItem("Remote control");
		mainMenu.setChildrenAllowed("Remote control", false);
				
	
		mainMenu.addItemClickListener(new ItemClickListener(){

			@Override
			public void itemClick(ItemClickEvent event) {
				// TODO Auto-generated method stub
				
				subnavigator = new Navigator(UI.getCurrent(), mainPanel);
				
				subnavigator.addProvider(provider);
				
				if(event.getItemId() == "Online temperature"){
					subnavigator.navigateTo(SubRealTimeView.VIEW_NAME);
				}
				if(event.getItemId() == "History temperature"){
					subnavigator.navigateTo(SubGraphView.VIEW_NAME);
				}
				if(event.getItemId() == "Video"){
					subnavigator.navigateTo(VideoView.VIEW_NAME);
				}
				if(event.getItemId() == "Remote control"){
					subnavigator.navigateTo(RemoteControlView.VIEW_NAME);
				}
				
				
			}});
		
	}


	@Override
	public void enter(ViewChangeEvent event) {
	

		
		
	}
	
	
	
}
