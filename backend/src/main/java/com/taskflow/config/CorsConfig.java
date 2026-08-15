package com.taskflow.config;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
@Configuration public class CorsConfig {@Bean WebMvcConfigurer cors(){return new WebMvcConfigurer(){public void addCorsMappings(CorsRegistry r){r.addMapping("/api/**").allowedOrigins("http://localhost:5173").allowedMethods("*").allowedHeaders("*");}};}}
