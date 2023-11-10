package org.example.views;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class Exporter extends WebComponentExporter<NewsletterSubscription> {
    public Exporter() {
        super("newsletter-subscription");
    }

    @Override
    protected void configureInstance(WebComponent<NewsletterSubscription> webComponent, NewsletterSubscription newsletterSubscription) {
        // Not needed...
    }
}
