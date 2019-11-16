package kr.ac.sunmoon.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.VerticalPanel;

public class KJInteractionWebService_SDP implements EntryPoint {
	
	public void onModuleLoad() {
		
		
		//Main Panel
		RootPanel.get("title").getElement().getStyle().setBackgroundColor("coral");
		RootPanel.get("main").getElement().getStyle().setBackgroundColor("#F0F8FF");
		final VerticalPanel vpMain = new VerticalPanel();
		vpMain.getElement().getStyle().setWidth(1024, Unit.PX);
		RootPanel.get("main").add(vpMain);
		
		final TopPanel topPanel = new TopPanel();
		vpMain.add(topPanel);
		
		final MenuPanel menuPanel = new MenuPanel();
		vpMain.add(menuPanel);
		
		final TabBar bar = new TabBar();
		bar.addTab("���� �� ��������");
		bar.addTab("Animation �Ϻ� VS �ѱ�");
		bar.addTab("������");
		bar.addTab("����");
		bar.addTab("�ڵ���");
		bar.setStyleName("bar");
		vpMain.add(bar);
		
		DecoratorPanel dp = new DecoratorPanel();
		vpMain.add(dp);
		
		ScrollPanel spResult = new ScrollPanel();
		spResult.getElement().getStyle().setBackgroundColor("#FFA07A");
		spResult.getElement().getStyle().setWidth(1200, Unit.PX);
		spResult.getElement().getStyle().setHeight(1000, Unit.PX);
		HTML video = new HTML("<iframe width=560 height=315 src=https://www.youtube.com/embed/bkcitbJzi6c "
				+ "frameborder=0 allow=accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture allowfullscreen></iframe>");
		video.getElement().getStyle().setMarginLeft(300, Unit.PX);
		spResult.add(video);
		dp.setWidget(spResult);
		
		//�ּ� �� ����ó
		Grid bottomPanel = new Grid(1,2);
		bottomPanel.getElement().getStyle().setWidth(1024, Unit.PX);
		final Label address = new Label("����ó");
		final Label question = new Label("��ȭ��ȣ");
		bottomPanel.setWidget(0, 0, address);
		bottomPanel.setWidget(0, 1, question);
		vpMain.add(bottomPanel);
	}
}
