public class MyMassive {
    public static int setMassive (String[][] arrayString) throws MyArraySizeException, MyArrayDataException {
        if (arrayString.length != 4 || arrayString[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть 4х4");
        }
        int sum = 0;
        for (int i=0; i < 4; i++) {
            if (arrayString[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4х4");
            }
            for (int j = 0; j < 4; j++) {
                try { 
                    int number = Integer.parseInt(arrayString[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, arrayString[i][j]);
                }
            }
        }
        return sum;
    }
}
