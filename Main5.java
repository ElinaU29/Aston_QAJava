public class Main5 {
    public static void main(String[] args) {
        // String[][] arrayString = {{"1","4", "8", "7"}, {"24", "1", "4", "2"}, {"5","8", "0", "0"}, {"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
        // String[][] arrayString = {{"1","4", "8", "7"}, {"24", "1", "4", "2", "5"}, {"5","8", "0", "0"}, {"0", "0", "0", "0"}};
        // String[][] arrayString = {{"1","4", "8", "7"}, {"ef", "rtgrt", "f", "f"},{"dc","rtgrt", "f", "f"}, {"ef", "rtgrt", "f", "f"}};
        String[][] arrayString = {{"1","4", "8", "7"}, {"24", "1", "4", "2"}, {"5", "8", "0", "0"}, {"0", "0", "0", "0"}};
        int sum = 0;
        try {
            sum = MyMassive.setMassive(arrayString);
            System.out.println("\n Сумма: " + sum);
        }
        catch (MyArraySizeException e) {
            System.out.println(e.message);
        }
        catch (MyArrayDataException e){
            System.out.printf("Непреобразованное значение: %s с индексом [%d][%d] \n", e.value, e.index[0], e.index[1]);
        }

        try { 
            String[] value = arrayString[10];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
