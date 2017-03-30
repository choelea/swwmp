package com.joe.swwmp.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.joe.swwmp.fm.directive.TestDirective;

/**
 * Overrides the default spring-boot configuration to allow adding shared variables to the freemarker context
 */
@Configuration
public class FreemarkerConfiguration extends FreeMarkerAutoConfiguration.FreeMarkerWebConfiguration {

   

    @Override
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer configurer = super.freeMarkerConfigurer();
        
        Map<String, Object> sharedVariables = new HashMap<>();
        sharedVariables.put("testDirective", new TestDirective());
        configurer.setFreemarkerVariables(sharedVariables);

        return configurer;
    }
}