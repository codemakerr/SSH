package action;

import java.util.List;
import java.util.Map;

import org.apache.catalina.valves.StuckThreadDetectionValve;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import bean.User;
import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserAction extends ActionSupport{
	User user;
	UserDao userdao=new UserDaoImpl();
	public User getUser(){
		
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
	public String add() throws Exception{  
		user.setUsername(user.getUsername());
		user.setUserpwd(user.getUserpwd());
		userdao.addUser(user);
		System.out.println(user);
		return "success";
	}
	public String delete() throws Exception{
		int userid=user.getUserid();
		userdao.updateUser(userid);
		return "success";
	}
	public String get() throws Exception{
		List<User> list=userdao.getUser();
		Map request=(Map)ActionContext.getContext().get("request");
		request.put("list", list);
		System.out.println(list.size());
		return "success";
	}   
}
