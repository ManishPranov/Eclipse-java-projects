package org.arraysmultiplevalues;

//create project package class mainmethod
public class SingleDimensionArray {
	public static void main(String[] args) {
//	type syntax of array
//	data type variable []= new datatype[];
//	here [] means array
		int a[] = new int[5];
//	here [5]means array contains 5 values 
//	those 5 values are of index array order 
//	i.e a[0],a[1],a[2],a[3],a[4]
		a[0] = 12;
		a[1] = 23;
		a[2] = 34;
		a[3] = 45;
		a[4] = 56;

//	to get output type for+ctrl+space
//	then select for each iterate over an array or iterable

		for (int i : a) {
			System.out.println(i);
		}

	}
}
 
