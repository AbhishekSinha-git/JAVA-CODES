public class NearestNeighbor {

    public static int findNearestNeighborIndex(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int minDistance = Integer.MAX_VALUE;
        int nearestIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                nearestIndex = i;
            }
        }

        return nearestIndex;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 9, 12, 17};
        int nearestIndex = findNearestNeighborIndex(array);
        System.out.println("Index of the first number with the smallest distance to its neighbor: " + nearestIndex);
    }
}

