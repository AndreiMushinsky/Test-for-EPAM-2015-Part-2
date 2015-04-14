package by.amushinsky.service;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase.access.getDepartments().getItem().forEach(y -> y.getEmployees().stream().forEach(x -> System.out.println(x.getFname())));
	}

}
