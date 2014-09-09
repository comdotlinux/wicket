package com.rhcloud.wicket;

import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

	@Override
	public Class<SimplePage> getHomePage() {
		return SimplePage.class;
	}

}
