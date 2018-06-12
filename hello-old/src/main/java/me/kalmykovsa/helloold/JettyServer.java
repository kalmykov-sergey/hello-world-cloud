package me.kalmykovsa.helloold;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JettyServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8082);
        ServletContextHandler contextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("me.kalmykovsa.helloold");
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletHolder springServletHolder = new ServletHolder("mvc-dispatcher", dispatcherServlet);
        contextHandler.addServlet(springServletHolder, "/");
        contextHandler.addEventListener(new ContextLoaderListener(context));

        server.setHandler(contextHandler);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (server.isStarted()) {
                server.setStopAtShutdown(true);
            }
        }));

        server.start();
        server.join();
    }
}
