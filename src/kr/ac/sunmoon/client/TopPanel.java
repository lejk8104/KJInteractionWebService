package kr.ac.sunmoon.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TopPanel extends HorizontalPanel{

	private TextBox txtSearch;
	
	public TopPanel() {
		super();
		this.addStyleName("hpTop");
		this.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
	
		HorizontalPanel hpNameBox = new HorizontalPanel();
		hpNameBox.getElement().getStyle().setWidth(256, Unit.PX);
		this.add(hpNameBox);
		
		final TextBox txtSearch = new TextBox();
		hpNameBox.add(txtSearch);
//		int mainWidth = vpMain.getOffsetWidth();
//		int optionWidth = lboxOption.getOffsetWidth();
//		txtSearch.setWidth((mainWidth - optionWidth) + "px");
		
		final HorizontalPanel hploginBox = new HorizontalPanel();
		hploginBox.getElement().getStyle().setWidth(256, Unit.PX);
		this.add(hploginBox);
		
		final HorizontalPanel hpTotalMenu = new HorizontalPanel();
		hpTotalMenu.getElement().getStyle().setWidth(256, Unit.PX);
		this.add(hpTotalMenu);
		
	}
}