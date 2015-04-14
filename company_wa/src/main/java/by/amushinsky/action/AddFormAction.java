package by.amushinsky.action;

import static by.amushinsky.service.DataBase.access;

import java.util.List;

import by.amushinsky.service.Department;

import com.opensymphony.xwork2.ActionSupport;

public class AddFormAction extends ActionSupport{
	
	private List<Department> deps;

	public List<Department> getDeps() {
		return deps;
	}

	public void setDeps(List<Department> deps) {
		this.deps = deps;
	}

	public String execute()
	{	
		deps = access.getDepartments().getItem();
		return SUCCESS;
	}
}
