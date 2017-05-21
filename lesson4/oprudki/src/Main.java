public class Main {
  public static void main(String[] args) {
int i = 10;
float f = 10.1f;
String str = "*****";
System.out.println("It's int ==> " + i);
System.out.println("It's float ==> " + f);
System.out.println("It's String ==> " + str);
System.out.println();

printString (str);
printString (str);
printString (str);
printString (str);
printString (str);

System.out.println("Printing 'str' through 'for':");
for(int j = 0; j < 5; j++) {
  printString(str);
}
System.out.println();

  String binary = "10011011";
  final int Bazis = 2;

  convertBinToDec1(binary, Bazis);
	convertBinToDec2(binary, Bazis);
  System.out.println();

  int decimal = 156;
	convertDecToBin1(decimal, Bazis);
  System.out.println();

int startYear = 2001;
int finishYear = 2017;
while (startYear <= finishYear) {
	leapYear(startYear);
	System.out.print(startYear + " ==> ");
	System.out.println(leapYear(startYear));
	startYear++;
}

int x = 1;
int counter = 1;
do  {
  System.out.println("It seems that I'm here forever");
  counter++;
if (counter > 5)
  break;
} while (x == 1);

}

public static void printString (String str) {
  System.out.println(str);
}


public static boolean leapYear (int startYear) {
	  if (startYear % 4 == 0)
	   return true;
	   else if (startYear % 100 == 0)
	   return false;
	   else if (startYear % 400 == 0)
	        return true;
	  return false;
  }

  public static void convertBinToDec1(String binary, int Bazis) {

  		int l = binary.length();
  		int[] initial = new int[l];
  		for (int i = 0; i < l; i++) {
  			initial[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
  			// System.out.print(initial[i] + " ");
  		}

  		int[] intermediate = new int[l]; // промежуточный массив для
  											// записи возведений в степень
  		int j = 1; // индекс уменьшения длины массива
  		for (int i = 0; i < l; i++) {
  			int b = l - j; // b = степень для возведения в неё двойки
  			int temporary = (int) Math.pow(Bazis, b);
  			intermediate[i] = temporary;
  			j++;
  			// System.out.print(intermediate[i] + " ");
  		}

  		int[] summ = new int[l];
  		int result = 0;
  		for (int i = 0; i < l; i++) {
  			int temporary = initial[i] * intermediate[i];
  			summ[i] = temporary;
  			// System.out.print(summ[i] + " ");
  			result = result + summ[i];
  		}
  		System.out.println("Convert binary through Positional Notation: '" + binary + "' ==> " + result);
  	}

  	public static void convertBinToDec2(String binary, int Bazis) {

  		int l = binary.length();
  		int[] initial = new int[l];
  		for (int i = 0; i < l; i++) {
  			initial[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
  			// System.out.print(initial[i] + " ");
  		}
  		int[] result = new int[l];

  		for (int i = 0; i < l; i++) {
  			int temporary = result[i] * Bazis + initial[i];
  			result[i] = temporary;
  			if (i < l - 1 && result[i + 1] == 0) {
  				result[i + 1] = temporary;
  			}
  			// System.out.print(intermediate[i] + " ");
  		}
  		System.out.println("Convert binary through Doubling: '" + binary + "' ==> " + result[l - 1]);
    }

    public static void convertDecToBin1(int decimal, int Bazis) {

    		int counterRemainder = 1;
    		int temp = decimal;

    		while (temp / Bazis > 0) {
    			temp = temp / Bazis;
    			counterRemainder++;
    		}
    		// System.out.println(counterRemainder);

    		int[] result = new int[counterRemainder];

    		temp = decimal;
    		int i = 0;
    		do {
    			result[i] = temp % Bazis;
    			temp = temp / Bazis;
    			i++;
    			// System.out.print(result[i]);
    		} while (temp / Bazis >= 1);
    		// System.out.println(i);
    		if (temp <= 1 && temp > 0) {
    			result[i] = 1;
    		}
System.out.print("Initial array: ");
    		for (i = 0; i < counterRemainder; i++) {
    			 System.out.print(result[i]);
    		}
    		System.out.println();

    		i = 0;
    		for (i = 0; i < counterRemainder; i++) {
    			temp = result[i];
    			result[i] = result[counterRemainder - 1 - i];
    			result[counterRemainder - 1 - i] = temp;

    			// System.out.print(result[i]);

    		}

    	}


}
