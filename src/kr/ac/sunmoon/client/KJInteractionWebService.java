package kr.ac.sunmoon.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class KJInteractionWebService implements EntryPoint {
	public void onModuleLoad() {
		// Main Panel
		RootPanel.get("title").getElement().getStyle().setBackgroundColor("coral");
		RootPanel.get("main").getElement().getStyle().setBackgroundColor("#F0F8FF");
		final VerticalPanel vpMain = new VerticalPanel();
		vpMain.getElement().getStyle().setWidth(1024, Unit.PX);
		RootPanel.get("main").add(vpMain);
		
		final TopPanel topPanel = new TopPanel();
		vpMain.add(topPanel);
		
		final MenuPanel menuPanel = new MenuPanel();
		vpMain.add(menuPanel);
		
		
	}
}
