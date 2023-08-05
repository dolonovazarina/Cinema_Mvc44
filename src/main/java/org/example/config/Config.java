package org.example.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Config extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    public  void  anStartup(ServletContext aServeContext)throws ServletException{
        super.onStartup(aServeContext);
       registerwiddenfieldfilter(aServeContext);
    }

    private void registerwiddenfieldfilter(ServletContext aServeContext) {
        aServeContext.addFilter("" +
                        "hiddenHttpMethodFilter", new HiddenHttpMethodFilter()).
                addMappingForUrlPatterns(null,true,"/n");
    }


    }
