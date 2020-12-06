package login.model;

import login.controller.LoginController;
import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public String name, username, password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception {

		String var = LoginController.loginVerify(this);
		if (var.equals("success")) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	
	
	

}
