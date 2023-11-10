# Integration example: Vaadin running insidea a React App

This integration example shows how to run a Vaadin component/ui within an application otherwise built with React. The React application is using Vite for build and Vite's `react-ts` templalte as a basis, but the integration principles are exactly the same, whatwever the build system is used.

The integration example shows only the development time setup. In an actual deployment you'll need to map the Spring Boot powered Vaadin application to "/vaadin-app" in your front-proxy, which is very deployment specific task.

Also note that in a typical setup, your React app probably uses some actual web framework and may be located in a separate source code repository. But the principle for embedding Vaadin app should still be exactly the same. Check out further details from a related article (TODO add link here when published)

## Running the demo

The Vaadin application is located in the embedded-vaadin-app directory. It contains a trivial newsletter subscription view as an example. Run it via your Java IDE or from command using `mvn spring-boot:run` (assuming you have Maven & Java 17 installed). The use is then available for testing in http://localhost:8080/vaadin-app/ and for embedding as a Web Component via http://localhost:8080/vaadin-app/web-component/newsletter-subscription.js

Next step is to run the actual "master web app", in this case built with raw React. The vite-built-react-app folder contains all for that. The vite.config.js configures the development server to proxy the locally running Vaadin application to `/vaadin-app`. In that directory, execute:

```
npm install
npm run dev
```

The port for your Vite dev server is shown on the output. If you open that link, you'll see a trivial React app, that opens a view built using Vaadin within the UI, if you click on the button.

That's all folks! You can now play around with either the Vaadin code or React code.
