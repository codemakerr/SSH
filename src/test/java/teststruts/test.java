package teststruts;

import java.sql.SQLException;
import java.util.List;

import bean.User;
import dao.UserDao;
import dao.impl.UserDaoImpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     UserDao userdao=new UserDaoImpl();
    // try {
	
	try {
		List<User> list = userdao.getUser();
		System.out.println(list);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	for(int i=0;i<list.size();i++){
//		System.out.println(list.get(i));
//	}
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}

}
