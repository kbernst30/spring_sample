package com.sitescout.dsp.config;

import com.sitescout.dsp.service.CampaignService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.sitescout.dsp.controller", "com.sitescout.dsp.service"})
public class AppConfig extends WebMvcConfigurerAdapter {
}