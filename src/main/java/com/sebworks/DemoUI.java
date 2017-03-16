package com.sebworks;

import com.sebworks.vaadstrap.*;
import com.vaadin.annotations.Viewport;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.UI;
import org.springframework.stereotype.Component;

/**
 * Created by bekce on 3/16/17.
 */
@SpringUI
@Component
@Viewport("width=device-width, initial-scale=1")
public class DemoUI extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		Container container = new Container();
		setContent(container);
		setSizeFull();

		Row row = container.addNewRow();
		Col col1 = row.addNewCol(ColMod.SM_6, ColMod.MD_4);
		Col col2 = row.addNewCol(ColMod.SM_6, ColMod.MD_4, VisibilityMod.HIDDEN_XS);
		col1.setChildrenStyle(MarginMod.TOP7);
		col1.addComponent(new TextArea());
		col1.addComponent(new TextArea());
		col2.addComponent(new Text().append("This ").appendBold("column").append(" will be hidden in ").appendSmall("XS").append(" screens"));
		col2.addComponent(new HorizontalLayout(new Button("Login", event -> Page.getCurrent().setLocation("/login")), new Button("New User")));
	}
}
