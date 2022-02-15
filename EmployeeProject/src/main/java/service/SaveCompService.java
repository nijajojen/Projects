package service;

import dao.CompDao;

public class SaveCompService {
	CompDao compDao= new CompDao();
	public void cTypeCheck(String cName,String cType,int cAmt) {
		if(cType == "percentage") {
		 if(cAmt<= 100)
			 compDao.saveComponentMaster1(cName, cType, cAmt );
		 else
			 System.out.println("percentage value should not be greater than 100");
		}
		else {
			compDao.saveComponentMaster1(cName, cType, cAmt );
		}

}
}
