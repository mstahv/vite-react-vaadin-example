package org.example.views;

import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.NoTheme;

/**
 * This component with the {@code @Route} annotation exists only for smoother local/standalone
 * development. The NewsletterSubscription is exported as "newsletter-subscription" and mashed
 * up in other web apps.
 * <p>
 * If you want to avoid publishing this as "stand-alone" component, but wish to keep
 * it for development, add it to src/test/java instead and configure your development
 * server to include it in the classpath.
 * </p>
 */
@Route
public class MainView extends NewsletterSubscription {
}
