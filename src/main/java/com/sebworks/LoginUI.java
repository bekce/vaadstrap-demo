package com.sebworks;

import com.sebworks.vaadstrap.*;
import com.vaadin.annotations.Viewport;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.stereotype.Component;

/**
 * Demo Login UI for vaadstrap
 * Created by bekce on 3/16/17.
 */
@SpringUI(path = "login")
@Component
@Viewport("width=device-width, initial-scale=1")
public class LoginUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		Container container = new Container();
		setContent(container);
		setSizeFull();

		TextField emailField = new TextField();
		emailField.setPlaceholder("Email");
		PasswordField passwordField = new PasswordField();
		passwordField.setPlaceholder("Password");
		Button loginButton = new Button("Login", FontAwesome.KEY);
		loginButton.setStyleName(ValoTheme.BUTTON_FRIENDLY);

		// add header
		container.addNewRow().addComponent(new Text().appendH2("Please sign in"));

		// add components
		container.addRow(
				new Row()
						.addCol(new Col(12, 4).addStyles(MarginMod.TOP7).add(emailField))
						.addCol(new Col(12, 4).addStyles(MarginMod.TOP7).add(passwordField))
						.addCol(new Col(12, 4).addStyles(MarginMod.TOP7).add(loginButton))
		);

	}
}
