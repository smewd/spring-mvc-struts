package com.smood.init;


import org.apache.struts.action.ActionServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;


public class WebAppInitializer implements WebApplicationInitializer
{
	@Override
	public void onStartup(ServletContext servletContext)
	{
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringContextConfig.class);

		ContextLoaderListener listener = new ContextLoaderListener(rootContext);
		servletContext.addListener(listener);

		initStrutsServlet(servletContext);
	}


	private void initStrutsServlet(ServletContext servletContext)
	{
		ActionServlet servlet = new ActionServlet();
		ServletRegistration.Dynamic servletReg = servletContext.addServlet("strutsActionServlet", servlet);
		servletReg.setLoadOnStartup(1);
		servletReg.setInitParameter("config", "/WEB-INF/struts-config.xml");
		servletReg.addMapping("*.do");
	}
}
