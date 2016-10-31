int[] myArray = new int[5];

myArray[0] = 1;
myArray[1] = 4;
myArray[2] = 3;
myArray[3] = 4;
myArray[4] = 4;

ArrayChecker check = new ArrayChecker();
if (!check.isSymetrical(myArray)) {
	myArray = check.reverse(myArray);
}
println myArray[0];
println myArray[1];
