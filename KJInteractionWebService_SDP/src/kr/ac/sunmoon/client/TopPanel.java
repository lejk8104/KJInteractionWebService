package kr.ac.sunmoon.client;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TopPanel extends HorizontalPanel {

	
	private TextBox txtSearch;
	
	public TopPanel() {
		super();
		this.addStyleName("hpTop");
		this.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		
//		Image imgLogo = new Image();
//		imgLogo.setUrl("image/kj_flag.jpg");
//		imgLogo.addStyleName("imgLogo");
//		this.add(imgLogo);
//		
		HorizontalPanel hpSearch = new HorizontalPanel();
		hpSearch.addStyleName("hpSearch");
		this.add(hpSearch);
		
		txtSearch = new TextBox();
		txtSearch.setStyleName("txtSearch");
		hpSearch.add(txtSearch);
		
//		Image imgSearch = new Image();
//		imgSearch.setUrl("image/search.png");
//		imgSearch.setStyleName("imgSearch");
//		hpSearch.add(imgSearch);
//		
		Button loginBtn = new Button("Log in");
		loginBtn.setStyleName("loginBtn");
		hpSearch.add(loginBtn);
		
		ListBox menuLb = new ListBox();
		menuLb.addItem("Main Page");
		menuLb.addItem("Chatting Page");
		menuLb.addItem("Advertising Page");
		menuLb.setVisibleItemCount(1);
		menuLb.setStyleName("menuLb");
		this.add(menuLb);
		
		//imgSearch implement here.
	}

}
