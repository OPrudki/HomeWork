import java.util.Arrays;

public class ArraysCopier {
    public static void main(String[] args) {

      int mNewLength = 20;
        int mFrom = 5;
        int mTo = 15;
        int mValue = 13;
        int[] arrayCopyOf = new int[mNewLength];

        copyOf(mNewLength);
        System.out.println();

        copyOfRange(mFrom, mTo,arrayCopyOf);

        fill(mValue);
    }

    public static int[] copyOf(int mNewLength) {
        int[] arrayCopyOf = new int[mNewLength];
        for (int i = 0; i < mNewLength; i++) {
            System.out.print(arrayCopyOf[i] + " ");
        }
        return arrayCopyOf;
    } // возвращает новый массив указанной длины.

    public static int[] copyOfRange(int mFrom, int mTo, int[] arrayCopyOf) {
        int i = mTo - mFrom;
        int j;
        int[] arrayCopyOfRange = new int[i];
        //arrayCopyOf[j];
        for (i = 0; i < arrayCopyOfRange.length; i++) {
            for (j = mFrom; j < mTo; j++) {
                arrayCopyOfRange[i] = arrayCopyOf[j];
            }
            }
        System.out.println(Arrays.toString(arrayCopyOfRange));
        return arrayCopyOfRange;
    } // возвращает новый массив, начиная с элемента from до элемента to

    public static int[] fill(int value) {
        int[] arrayFill = new int[value];
        for (int i = 0; i < value; i++) {
            arrayFill[i] = value;
            System.out.print(arrayFill[i] + " ");
        }
        return arrayFill;
    } // возвращает новый массив заполненный значением параметра value

}
