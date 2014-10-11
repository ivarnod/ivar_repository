package com.ivar.model;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Client {
	public static void main(String Args[]){
		Configuration configuration = new Configuration();
		configuration.configure();
		setAnnotetedClasses(configuration);
		
		EmployeeEntity entity = new EmployeeEntity();
		entity.setName("Ram");
		entity.setRole("Worker");
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory factory =configuration.buildSessionFactory(serviceRegistry) ;
		
		Session session = factory.openSession();
		Transaction transaction = session.getTransaction();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		transaction.commit();
		session.close();
		
		
		
	}

	private static void setAnnotetedClasses(Configuration configuration) {

		configuration.addAnnotatedClass(EmployeeEntity.class);
	}

}
