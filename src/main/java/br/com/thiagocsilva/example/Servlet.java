package br.com.thiagocsilva.example;

import com.vaadin.quarkus.QuarkusVaadinServlet;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/*", name = "VaadinServlet", asyncSupported = true, initParams = {

        @WebInitParam(name = "devmode.gizmo.enabled", value = "false")})
public class Servlet extends QuarkusVaadinServlet {
}
