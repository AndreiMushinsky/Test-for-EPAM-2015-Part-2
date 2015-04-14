package by.amushinsky.action;

import static by.amushinsky.service.DataBase.access;

import java.util.ArrayList;
import java.util.List;

import by.amushinsky.service.Department;
import by.amushinsky.service.Employee;

import com.opensymphony.xwork2.ActionSupport;

public class BasicAction extends ActionSupport{
	
	private List<Department> departments;
	private int depId;
	private int averageSalary;
	

	public int getAverageSalary() {
		return averageSalary;
	}

	public void setAverageSalary(int averageSalary) {
		this.averageSalary = averageSalary;
	}

	public List<Employee> getEmployees()
	{
		return  (depId <= 0)? new ArrayList<Employee>():
							  departments.stream()
							  			 .filter(dep -> dep.getId()==depId)
							  			 .findFirst().get()
							  			 .getEmployees();						 
	}
	
	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public BasicAction(){	
		departments = access.getDepartments().getItem();
	}
	
	public String execute()
	{
		averageSalary = (int) Math.round(
											getEmployees().stream()
														  .mapToInt(x -> x.getSalary())
														  .average()
														  .orElse(0)
										);
		return SUCCESS;
	}
	
	public void validate()
	{
		if(depId == -1)
			addFieldError("depId", "Отдел не выбран!");
	}
}
