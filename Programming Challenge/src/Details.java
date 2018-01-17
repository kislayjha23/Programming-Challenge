import java.util.*;
import java.io.*;
public class Details {
  // properties of the class which i have declared privately to show data encapsulation
	private int id;
	private String name;
	private String phone;
	private String address;
	//constructor to initialize
	public Details(){
		this.name=null;
		this.phone=null;
		this.address= null;
	}
	public Details(int idno,String name,String phone, String address){
		this.id = idno;
		this.name = name;
		this.phone=phone;
		this.address=address;
	}
	// to get data method as per requirement which returns the data
	public String getdata(){
		return String.format("ID:%d NAME:%s PHONE:%s ADDRESS:%s", this.id,this.name,this.phone,this.address);
	}
}

