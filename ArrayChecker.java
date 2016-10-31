public class ArrayChecker {

public boolean isSymetrical (int[] myArray){
	boolean check = true;
	for(int i=1; i<myArray.length; i++){
		if(!(myArray[i-1]==myArray[myArray.length-i])) {
			check = false;
		}
	}
	return check;
}

public int[] reverse (int[] myArray){
	int[] reversedArray = new int[myArray.length];
	for(int i=1; i<myArray.length; i++){
		reversedArray[i-1]=myArray[myArray.length-i];
	}
	return reversedArray;
}

}