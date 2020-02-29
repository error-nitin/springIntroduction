package com.springintroduction.test.SpringIntroduction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration file for scanning all the component classes.
 * @author error.nitin@gmail.com
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.springintroduction.test.SpringIntroduction"})
public class SpringIntroductionConfig {

}
