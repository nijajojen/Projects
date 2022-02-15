package dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project.assignment.EmployeeProject.entity.Component;
import com.project.assignment.EmployeeProject.entity.HibernateUtil;


public class CompDao {
	public Component saveComponentMaster1(String cName,String cType,int cAmt) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= null;
		Component comp= new Component();
		comp.setCompName(cName);
		comp.setCompType(cType);
		comp.setCompAmt(cAmt);
		
		try {
			
			session= factory.openSession();
			session.beginTransaction();
			session.save(comp);
		}
		catch(Exception ex){
			session.getTransaction().rollback();
		}
		finally {
			session.close();
		}
		
		return comp;
		
	}

}
