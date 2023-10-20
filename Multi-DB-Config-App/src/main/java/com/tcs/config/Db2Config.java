package com.tcs.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", 
								basePackages= {"com.tcs.db2.repositories"})

public class Db2Config {

	
	
		@Bean(name="bookDataSource")
		@ConfigurationProperties(prefix = "spring.db2.datasource")
		public DataSource dataSource()
		{
			return DataSourceBuilder.create().build();
		}
		@Bean(name = "bookEntityManagerFactory")
		public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, 
				@Qualifier("bookDataSource") DataSource dataSource) 
			{
				HashMap<String, Object> properties = new HashMap<>();
				properties.put("hibernate.hbm2ddl.auto","update");
				
				return builder.dataSource(dataSource)
								.properties(properties)
								.packages("com.tcs.db2.entities")
								.persistenceUnit("Book")
								.build();
			}
		
		@Bean(name = "bookTransactionManager")
		public PlatformTransactionManager transactionManager(@Qualifier("bookEntityManagerFactory") EntityManagerFactory bookEntityManagerFactory)
		{
			return new JpaTransactionManager(bookEntityManagerFactory);
		}
		

	}

