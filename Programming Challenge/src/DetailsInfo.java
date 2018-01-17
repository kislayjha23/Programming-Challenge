
import java.util.*;
import java.io.*;

public class DetailsInfo
{
	public static void main(String args[]){
		ArrayList <Details> details = new ArrayList();
		Details d1 = new Details(1,"Kislay","8787998998","38 van reipen ave");
		details.add(d1);
		Iterator<Details> i = details.iterator();
		while (i.hasNext()){
			System.out.println(i.next().getdata());
		}
	}
}

