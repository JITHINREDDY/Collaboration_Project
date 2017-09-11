package com.niit.collaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.collaborate.dao.BlogDAO;
import com.niit.collaborate.dao.BlogDAOImpl;
import com.niit.collaborate.model.Blog;

@Configuration
@ComponentScan("com.niit.collaborate")
@EnableTransactionManagement
public class DBConfig {

	
	//1.Create Datasource
	public DataSource getOracleDataSource()
	{
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver"); // link
		driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE"); //default port no is 1521 for oracle 
		driverManagerDataSource.setUsername("hr");
		driverManagerDataSource.setPassword("hr");
		return driverManagerDataSource;
	}
	
	//2.creating hibernate properties... used by LocalSessionFactory
	public Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle11gDialect");
		System.out.println("Hibernate Proprty created");
		return properties;
	}
	
	//3. creating the sessionfactory bean using localsessionfactory
	@Bean
	public SessionFactory getsessionFactory()
	{
		LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(getOracleDataSource());
		localSessionFactoryBuilder.addProperties(getHibernateProperties());
		localSessionFactoryBuilder.addAnnotatedClass(Blog.class);
		System.out.println("SessionFactory Bean Created");
		return localSessionFactoryBuilder.buildSessionFactory();
	}
	
	//4. HibernateTransaction Bean
	
	@Bean
	public HibernateTransactionManager getHibernateTransactionMangaer(SessionFactory sessionFactory)
	{
		return new HibernateTransactionManager(sessionFactory);
	}

	//5. appl. specifi DAO bean
	
	@Bean
	public BlogDAO getBlogDAO(SessionFactory sessionFactory)
	{
		
		return new BlogDAOImpl(sessionFactory);
	}
	
	
	
}
