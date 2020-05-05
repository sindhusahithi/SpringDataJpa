package com.Jpa;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = { "net.codejava.spring" })
public class Appconfig {
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("Sampledb");

		return factoryBean;
	}

	@Bean
	public JpaTransactionManager tm(EntityManagerFactory entityManagerFactory) {

		JpaTransactionManager transactionmanager = new JpaTransactionManager();
		transactionmanager.setEntityManagerFactory(entityManagerFactory);
		return transactionmanager;

	}
}
