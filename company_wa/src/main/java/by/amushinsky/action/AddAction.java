package by.amushinsky.action;

import static by.amushinsky.service.DataBase.access;

import java.util.List;

import by.amushinsky.service.DataBase;
import by.amushinsky.service.Department;
import by.amushinsky.service.Employee;

import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{
	
	private Employee employee;
	private int depId;
	private List<Department> deps;
	
	public AddAction() 
	{
		deps = access.getDepartments().getItem();
	} 
	
	public List<Department> getDeps() {
		return deps;
	}

	public void setDeps(List<Department> deps) {
		this.deps = deps;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String execute()
	{
		Department department = DataBase.access.getDepartment(depId);
		department.getEmployees().add(employee);
		DataBase.access.updateDepartment(department);
		return SUCCESS;
	}
	
	public void validate()
	{
		if(employee.getLname().length() == 0)
			addFieldError("employee.lname", "Не указана фамилия!");
		if(employee.getFname().length() == 0)
			addFieldError("employee.fname", "Не указано имя!");
		if(employee.getPname().length() == 0)
			addFieldError("employee.pname", "Не указано отчество!");
		if(employee.getSalary() == 0)
			addFieldError("employee.salary", "Зарплата не может ровняться нулю!");
		if(employee.getSalary() < 0)
			addFieldError("employee.salary", "Зарплат не может быть отрицательной!");
		if(depId == -1)
			addFieldError("depId", "Отдел не выбран!");
	}
}
