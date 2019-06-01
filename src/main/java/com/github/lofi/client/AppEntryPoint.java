package com.github.lofi.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class AppEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Button button = new Button("Click me");
		
		button.addClickHandler(clickEvent -> {
			Window.alert("Hello World!");
		});
		
		RootPanel.get("helloButton").add(button);
	}
}
