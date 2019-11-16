package kr.ac.sunmoon.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class MenuPanel extends HorizontalPanel{

	public MenuPanel() {
		super();
		this.addStyleName("manuPanel");
		
		addMenufunction("여행 & 관광 정보");
		addMenufunction("Animation Korean vs Japanese");
		addMenufunction("Sports");
		addMenufunction("Vecile information");
	}
	private void addMenufunction(String text) {
		
		Label lblMenufunction = new Label(text);
		lblMenufunction.getElement().getStyle().setFontSize(20, Unit.PX);
		lblMenufunction.getElement().getStyle().setMarginRight(10, Unit.PX);
//		lblMenufunction.getElement().getStyle().setColor("blue");
//		lblMenufunction.addStyleName("lblMenuItem");  //입력할 것
		this.add(lblMenufunction);
	}
}
