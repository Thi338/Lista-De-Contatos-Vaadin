package br.com.thiagocsilva.example;

import com.vaadin.flow.component.notification.Notification;
import jakarta.inject.Inject;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends VerticalLayout {

    @Inject
    GreetService greetService;

    public MainView() {
        TextField textField = new TextField("Your name");
        textField.addThemeName("bordered");

        Button button = new Button("Say hello", e -> {
            String greeting = greetService.greet(textField.getValue());
            Notification.show(greeting);
        });

        add(textField, button);
    }
}
