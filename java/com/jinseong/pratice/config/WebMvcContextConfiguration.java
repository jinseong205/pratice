package com.jinseong.pratice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration															// 설정 파일
@EnableWebMvc															// MVC 사용 설정
@ComponentScan(basePackages = {"com.jinseong.pratice.controller"})		// Controller Componenet 스캔

public class WebMvcContextConfiguration extends WebMvcConfigurerAdapter {
	
	// resource hanlder 등록
	// static 한 자원을  서비스
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/META-INF/resources/webjars/").setCachePeriod(31556926);
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
    }
 
    // default servlet handler를 사용
	// mapping 정보가 없는 경우에는 DeafaultsServlet이 처리
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
   
    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
    		System.out.println("***** addViewControllers  ");
        registry.addViewController("/").setViewName("main");
    }
    
    // 특정 url에 대한 처리를 Controller Class를 작성 하지 않고 매핑 할 수 있게한다.
    // url에 prefix 와 suffix를 결합하여 사용
    // main => /WEB-INF/views/main.jsp
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        System.out.println("*********** View resolver ************* " + resolver.toString());
        
        
        return resolver;
    }
    
}
