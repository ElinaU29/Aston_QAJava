public class MyArrayDataException extends Exception {
    int[] index = new int[2];
    String value; 
    MyArrayDataException(int i, int j, String value) {
        this.index[0] = i;
        this.index[1] = j;
        this.value = value;
    }
}
