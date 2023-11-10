package org.example.views;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;

import java.net.URL;

/**
 * This is a tiny example of a Vaadin component that is
 * exported as a web component to be embedded in other web
 * apps/sites.
 */
public class NewsletterSubscription extends VerticalLayout {

    private URL url;
    EmailField emailField = new EmailField("Your email:");
    Button button = new Button("Subscribe!", this::subscribe);

    public NewsletterSubscription() {
        emailField.setRequired(true);
        add(
                new H3("Subscribe to newsletter"),
                new Paragraph("This part of the app comes from a Vaadin app"),
                emailField,
                button
        );
        getStyle().setBorder("1px dotted black");
    }

    private void subscribe(ClickEvent<Button> buttonClickEvent) {
        if(emailField.isInvalid()) {
            Notification.show("Please enter a valid email address!");
            return;
        }
        // TODO here you would connect to your backend service
        Notification.show(emailField.getValue() +
                " subscribed to newsletter from page " + url);
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent);
        // In many integrations, it is good to know the actual URL
        // of the user
        attachEvent.getUI().getPage().fetchCurrentURL(url -> {
            this.url = url;;
        });
    }
}
