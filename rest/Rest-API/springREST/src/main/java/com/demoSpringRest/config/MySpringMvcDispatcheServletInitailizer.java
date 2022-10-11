package com.demoSpringRest.config;
//step1-maven dependanvy adding

//from step2- configruation

//step3- servelet initializer
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcheServletInitailizer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
          DemoAppConfig.class //from step2
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/" };//map to root path
    }
}
