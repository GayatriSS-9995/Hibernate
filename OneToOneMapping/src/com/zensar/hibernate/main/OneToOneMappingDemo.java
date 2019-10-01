package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Country c1  = new Country();
		c1.setLanguage("Hindi");
		c1.setName("India");
		c1.setPopulation(130000000l);
		
		Flag f = new Flag();
		f.setFlagName("Tiranga");
		f.setDescription("It is a TRICOLOR FLAG");
		
		c1.setFlag(f);
		f.setCountry(c1);
		s.save(c1);
		s.save(f);
		t.commit();
		s.close();
		System.exit(0);
	}

}
