package dao;

import java.sql.SQLException;
import java.util.List;

import bean.User;

public interface UserDao {
 int addUser(User user) throws SQLException;//����û�
 int updateUser(int userid) throws SQLException;//ɾ���û�
 List getUser() throws SQLException;//�����û�
	 
}
