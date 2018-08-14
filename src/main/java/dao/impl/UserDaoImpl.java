package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import bean.User;
import dao.UserDao;
import dbutil.Dbutil;

public  class UserDaoImpl implements UserDao{

	public int addUser(User user) throws SQLException {
		QueryRunner runner=new QueryRunner(Dbutil.dataSource);
		String sql="insert into userinfo values (null,?,?)";
		Object []param={user.getUsername(),user.getUserpwd()};
		int count=runner.update(sql, param);
		return count;

	}

	public int updateUser(int userid) throws SQLException {
		QueryRunner runner=new QueryRunner(Dbutil.dataSource);
		String sql="delete from userinfo where userid=?";
		Object [] params={userid};
		int count=runner.update(sql, params);
		
		return count;
	}
	public List getUser() throws SQLException {
		QueryRunner runner=new QueryRunner(Dbutil.dataSource);
		String sql="SELECT * FROM userinfo";
		List list=runner.query(sql, new BeanListHandler<User>(User.class));
		return list;
	}

}
