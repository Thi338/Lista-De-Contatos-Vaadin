package br.com.thiagocsilva.ui;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

@Theme("starter-theme")
@PWA(name = "Flow CRM Tutorial", shortName = "Flow CRM Tutorial", offlineResources = "")
public class AppConfig implements AppShellConfigurator {
}
