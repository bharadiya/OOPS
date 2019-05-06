package CollectionFramework.ListPackage;

import java.util.ArrayList;

/*
 Array disadvantages :
	-It is fixed in size
	-If remaining array positions you are not using into 
     the entire program unnecessary wastage of memory.
 	-Homogeneous that means we can pass only one data type eg. int.
 	-Array has no predefined method support like that of String class 
 	 It has only .length
 	
 	This is the reason why collection frameworks were introduced.
*/

/*Collection Framework

	-It is variable in terms of size at runtime.
	-It is heterogenoues.
	-Predefined method support.
	-Collection automatically type casts data into objects.
	
  */

/*
	Framework API is collection of classes, abstract classes and interfaces
	where operations are written in form of methods.
*/

/*Collection (Interface) 		-- Parent
	1.List (Interface)				--Child
		1.1 ArrayList (Class)		--Subchild
			-Random Access
			-When insertion and deletion are frequent then not recommended
			-recommended when frequent reading operations are required.
			-Backend data structure is an array
			
		1.2 LinkedList (Class)		--Subchild
			-Doubly linked list.
			
		1.3	Vector (Class)			--Subchild
	2.Set (Interface)				--Child
	3.Queue (Interface)				--Child */

/*List Interface
	-It is variable in size
	-Duplicates are allowed.
	-Insertion order is preserved
	-Backend data structure is an array
	-Random access is provided.
	-Null Insertion is also possible.
	-new capacity=(initial capacity *3/2) +1
	*/

public class ArrayListexample {
	public static void main(String[] args) {
		ArrayList <Integer>al = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			al.add(i, i);
		}
		al.add(4,5);
//		al.add(4,5);
//		al.add(4,5);
//		al.add(4,5);
//		al.remove(4);
//		al.remove(4);
		//al.add(2,"Typing a string");
//		al.remove(4);
		System.out.println(al.size());
		int sum=0;
		sum=al.get(0)+al.get(1);
		System.out.println(sum);

	}
}

/*
Assignment : 
	
	1. Create 3 arraylist , firstname middlename and lastnames.then
		create one more arraylist fullnames add all three arraylist in full name.
		Then print full name of every student.
	2. 




*/