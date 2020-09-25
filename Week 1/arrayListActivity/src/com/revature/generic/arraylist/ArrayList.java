package com.revature.generic.arraylist;

//For this activity, implement all of the below methods

public class ArrayList<T>{
	T[] arr;
	int count;
	
	//Add some generic item to some kind of list represented by the array
	public void add (T t) {
		//We can use count to tell where our list ends
		if (count < arr.length) {
			arr[count] = t;
			++count;
		}
		else {
			
			//Create a new array of size arr.length*2
			T[] newArr = (T[])new Object[arr.length*2];
			
			//Copy arr into new array
			for(int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
			
			//Add our item
			add(t);
		}
	}
	
	public T get(int i) {
		return arr[i];
	}
	
	public int size() {
		return arr.length;
	}
	
	public int count() {
		return count;
	}
	
	//Split should take arr and split into a number of subarrays
	//The number is given by numberOfNewArrays
	//Ex: if [1, 5, 6, 5, 7] and input 3, the output would be: [1,5], [6, 5], [7, null]
	public T[][] split(int numberOfNewArrays){
		//Make a new array of size numberOfNewArrays 
		//Array of arrays that each contains length/numberOfNewArrays elements
		int newSize;
		if(count % numberOfNewArrays == 0) {
			newSize = count/numberOfNewArrays;
		}
		else {
			newSize = (count/numberOfNewArrays) + 1;
		}
		
		//newSize = (count + numberOfNewArrays - 1)/numberOfNewArrays;
		
		
		T[][] returnVal = (T[][])new Object[numberOfNewArrays][arr.length/numberOfNewArrays];
		
		//Use a for loop to copy elements into the new arrays
		int currentIndex = 0;
		for(int i = 0; i < returnVal.length; i++) {
			for(int j = 0; j < returnVal[i].length; j++) {
				if(currentIndex >= count) {
					break;
				}
				returnVal[i][j] = arr [currentIndex];
				++currentIndex;
			}
		}
		
		//Return the array
		return returnVal;
	}

}
