package dao;

import java.sql.SQLException;
import java.util.List;

import bean.User;

public interface UserDao {
 int addUser(User user) throws SQLException;//添加用户
 int updateUser(int userid) throws SQLException;//删除用户
 List getUser() throws SQLException;//查找用户
	 
}
