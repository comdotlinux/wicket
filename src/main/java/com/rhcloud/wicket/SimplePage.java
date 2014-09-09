package com.rhcloud.wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import com.rhcloud.wicket.service.HelloService;

public class SimplePage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4798438529281935188L;

	@SpringBean
	private HelloService helloService;
	
	
	public SimplePage(final PageParameters pageParameters){
		add(new Label("msg",helloService.getMessage()));
	}
	
}
