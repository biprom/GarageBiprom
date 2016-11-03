package com.biprom.garage.UI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.biprom.garage.model.Parameters;
import com.biprom.garage.repo.RepoParameters;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = SubGraphView.VIEW_NAME)

public class SubGraphView extends SubGraphDesign implements View {
	
	public static final String VIEW_NAME = "subGraphView";
	
	
	@Autowired
	@Qualifier("repository")
	private RepoParameters repository;
	
	

	@Override
	public void enter(ViewChangeEvent event) {
		
		 //fetch all customers
				System.out.println("find all parameters:");
				System.out.println("-------------------------------");
				for (Parameters param : repository.findAll()) {
					System.out.println(param);
				}
				System.out.println();
		
	}

}
