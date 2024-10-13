# JAVA-CODES-2

Code 1: Even and Odd Arrays
main(String[] args): Main method handling user input, array creation, and printing.
Scanner scanner: Reads input from the user.
even[] and odd[]: Arrays to store even and odd numbers.
Loop: Accepts numbers and assigns them to even or odd arrays based on parity.
scanner.close(): Closes the Scanner object.

Code 2: Nearest Neighbor Method
findNearestNeighborIndex(int[] array): Finds index of the first number with smallest distance to its neighbor.
Variables: minDistance and nearestIndex track minimum distance and nearest neighbor index.
Loop: Calculates distance between neighboring elements.
Returns: Index of the first number with the smallest distance.

Code 3: Array to ArrayList Conversion
main(String[] args): Main method demonstrating array to ArrayList and vice versa.
Arrays.asList(array): Converts array to ArrayList.
ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));: Creates ArrayList from values.
arrayList2.toArray(new Integer[0]): Converts ArrayList to array.
