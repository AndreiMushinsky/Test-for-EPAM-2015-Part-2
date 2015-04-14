package by.amushinsky.service;

public class DataBase 
{
	private DataBase(){}
	
	public static final DBInterface access = new DBInterfaceImplService()
													.getDBInterfaceImplPort();
}
