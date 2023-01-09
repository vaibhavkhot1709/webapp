package com.webapp.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.webapp")
@EnableWebMvc
@PropertySource("classpath:emp.properties")
public class EmpMvcMapping {

	@Autowired
	Environment environment;

	@Bean
	public InternalResourceViewResolver resolveView() {
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/");
		ivr.setSuffix(".jsp");
		return ivr;
	}

	@Bean
	public DataSource datasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("database.driver"));
		dataSource.setUrl(environment.getRequiredProperty("database.url"));
		dataSource.setUsername(environment.getRequiredProperty("database.user"));
		dataSource.setPassword(environment.getRequiredProperty("database.password"));

		return dataSource;
	}

	@Bean
	public Properties properties() {

		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));

		return properties;
	}

	@Bean
	public LocalSessionFactoryBean session() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

		factoryBean.setDataSource(datasource());
		factoryBean.setPackagesToScan(new String[] { "com.webapp.model" });

		factoryBean.setHibernateProperties(properties());
		return factoryBean;
	}

}
