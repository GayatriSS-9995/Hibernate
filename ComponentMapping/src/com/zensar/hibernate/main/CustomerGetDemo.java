package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {

	public static void main(String[] args) 
	{
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Customer cu = s.get(Customer.class, 101);
		System.out.println(cu.getCustomerId());
		System.out.println(cu.getAddress());
		System.out.println(cu.getAge());
		System.out.println(cu.getGender());
		System.out.println(cu.getBirthDate());
		Name name = cu.getCustomerName();
		System.out.println(cu.getCustomerName());
		Blob customerPhoto = cu.getProfilePhoto();
		try {
			/*
			 * InputStream in = customerPhoto.getBinaryStream(); FileOutputStream fout = new
			 * FileOutputStream("./resourses/newphoto.jpg"); int data=0;
			 * while((data=in.read())!=-1) { fout.write(data); }
			 */
			Clob description = cu.getDescription();
			Reader r  = description.getCharacterStream();
			PrintWriter pw = new PrintWriter("./resourses/customerdb.txt");
			int charData=0;
			while((charData=r.read())!=-1)
			{
				pw.print((char)charData);
			}
			r.close();
			pw.close();
			t.commit();
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
