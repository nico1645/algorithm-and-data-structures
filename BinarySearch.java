
class BinarySearch {
    public static void main(String args[]){
        int[] A = new int[] {1,3,5,6,7,10};
        int[] B = new int[] {1,3,7,8,9,10,16,32,54};
        int i = binarySearch(A, 1);
        int j = binarySearch(B, 33);
        System.out.println("A: "+i+ " B: " + j);
    }

    public static int binarySearch(int[] A, int value) {
        int left = 0;
        int right = A.length-1;
        int mid;
        
        while (left <= right) {
            mid = (right+left)/2;
            if (A[mid] < value) {
                left = mid+1;
            } else if (A[mid] > value) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
