package com.example.demoapp;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;


public class Main {

    public static void main(String args[]) throws Exception {
        Server server = new Server(8080);

        // Look for annotations in the classes directory (dev server) and in the
        // jar file (live server)
        ServletContextHandler contextHandler
                = new ServletContextHandler(ServletContextHandler.SESSIONS);
        contextHandler.setContextPath("/");

        contextHandler.addServlet( HelloServlet.class, "/*");
        server.setHandler(contextHandler);

        server.start();
        System.out.println("Server started!");

        // Keep the main thread alive while the server is running.
        server.join();
    }
}
