//all java codes//

/* REVERSE AN ARRAY
package javafolder;

import java.util.*;
public class second{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int arr[] = new int[s];

    int l = arr.length;
    //int n = Math.floorDiv(l, 2);
    int n = l/2;
    int temp;

    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i < n; i++){
        temp = arr[i];
        arr[i] = arr[l-i-1];
        arr[l-i-1] = temp;
    }
    for(int elements:arr){
        for(int elements:arr){
        for(int elements:arr){
    for(int elements:arr){
    for(int elements:arr){
        System.out.print(elements + " ");
        }
    
    sc.close();
    }
}
*/

/* MAXIMUM AND MINIMUM VALUE IN AN ARRAY
package javafolder;

public class first{
public static void main(String[] args){
int arr[] = {1, 5, 8, 87, 2, 10, -3, 192};

int max  = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;

MAXIMUM VALUE IN AN ARRAY

for(int element : arr){
    if(element > max){
        max = element;
    }
}
MIMIMUN VALUE IN AN ARRAY

for(int i = 0; i < arr.length; i++){
    if(arr[i] < min){
        min = arr[i];
    }
}
System.out.println(min);
    }
}
*/

/*String name = "Suraj Ravsaheb Patil";
name.charAt(2);
*/

/*
String name = "suraj ravsaheb patil";
String subname = name.substring(6,15);
 */

 /*StringBuilder name = new StringBuilder("name");
System.out.println(name);

name.setCharAt(0, 's');
System.out.println(name);

name.insert(0, 's');
System.out.println(name);

name.delete(0, 1);
System.out.println(name);
 */

 /* REVERSE A STRING
 /* REVERSE A STRING
    StringBuilder name = new StringBuilder("name");
    for(int i = 0; i<name.length()/2; i++){
    int front = i;
    int back = name.length() - 1 - i;

    char frontchar = name.charAt(front);
    char backchar = name.charAt(back);

    name.setCharAt(front, backchar);
    name.setCharAt(back, frontchar);
        }
    System.out.println(name); 
*/

/*N POWER OF X
package javafolder;

import java.util.*;
public class first {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int y = 1;
        int count = 1;

        while(count <= n){
            y = y * x;
            count++;
        }
        System.out.println(y);

        sc.close();
    }
}
 */

 /* PALINDROME NUMBER
package javafolder;

import java.util.*;
public class first {
public static void main(String[] args) {
    String reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String original = sc.nextLine();

        int length = original.length();

        for(int i = length - 1; i >= 0; i-- )
        reverse = reverse + original.charAt(i);
        
        if(reverse.equals(original))
        System.out.println("number is palindrome");
        else
        System.out.println("number is NOT palindrome");

        sc.close();
    }
}
*/

/* TRANSPOSE OF MATRIX
package javafolder;
import java.util.*;
class second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("enter the number of rows and columns of first matrices");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println("Enter the elements of matrix");
        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        int transpose[][] = new int[n][m];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transposed matrices is :");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(transpose[i][j] + "\t");
                System.out.println();
        }
        sc.close();
    }
}
*/
/*
NEW
class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}

class first {
    public static void main(String args[]) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
 */

/*Reverse an array
  class practice {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,0,4,-10,-2,8,78,65,-1,0};
        

        System.out.println("Sorted array is");

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
*/
/*multiplication of matrix
 public class practice1 {
    public static void main(String args[]) {
        // creating two matrices
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        // creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3]; // 3 rows and 3 columns

        // multiplying and printing multiplication of 2 matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                } // end of k loop
                System.out.print(c[i][j] + " "); // printing matrix element
            } // end of j loop
            System.out.println();// new line

        }
    }
}
*/
/*class Array {
    void reverse(int arr[]) {
        int temp;
        
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    void getArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class practice1{
    public static void main(String[] args) {
        Array a1 = new Array();
        int arr[] = {1, 2, 3, 4, 5};

        a1.reverse(arr);
        a1.getArray(arr);
    }
}
 */
/*
 power of 5

 import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        
        long result = 1;
        
        for (long i = 0; i < n; i++) {
            result = result*5;
        }
                System.out.println((result));
    }
}

 */
/*
 Hacker rank

 import java.util.Scanner;

public class second {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1 , x);
            }
            System.out.println("================================");

    }
}
 */

 /*
  *import java.util.*;
import java.io.*;
import java.math.*;


class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                // if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
  */
  /*import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int x = 5;
        double y = 3.14159;
        String formatted = String.format("x = %d, y = %.4f", x, y); // "x = 5, y = 3.14"
        System.out.println(formatted);
        
    }
} */
/*
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000];
        int s, i, j, t, l1 = 0, l2 = 0, c = 0;

        System.out.println("Enter the no of sample");
        s = sc.nextInt();

        System.out.println("Enter the no of range");
        t = sc.nextInt();

        System.out.println("Enter the numbers");
        for (i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < t; i++) {
            System.out.println("Enter the max and min range");
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            for (j = 0; j < s; j++) {
                if ((a[j] >= l1) && (a[j] <= l2))
                    c++;
            }
            System.out.println(c);
            c = 0;
        }
    }
}
 */
/*import java.util.Scanner;

class second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int length = 0;
        for (int i = 0; i <= n; i++) {
            String Word = sc.nextLine();
            length = Word.length();

            if(length > 10){
                System.out.print( Word.charAt(0));
                System.out.print(length-2);
                System.out.print(Word.charAt(length-1));
            }
            else{
                System.out.println(Word);
            }

        }
    }
} */
/*import java.util.Scanner;

class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, rem, mul = 1;
        n = sc.nextInt();
        while (n != 0) {
            rem = n % 10;
            mul = mul * rem;
            n = n / 10;
        }
        System.out.println(mul);
    }
}
 */
/*import java.util.Scanner;

class second {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Max = 0,count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Max) {
                if (arr[i] > 0) {
                    count = count + arr[i];
                } else {
                    count = count - arr[i];
                }
            }
        }
        if (Max > count) {
            System.out.println(Max - count);
        } else {
            System.out.println(Max + count);
        }

        sc.close();
    }
} */

/*import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String input = sc.nextLine();

       int arr[] = new int[200];

       for (char c : input.toCharArray()) {
            arr[c]++;
       }

       char oddchar = '\0';
       for (char c : input.toCharArray()) {
            if(arr[c] % 2 == 1){
                oddchar = c;
                break;
            }
       }
       if(oddchar != '\0'){
        System.out.println(oddchar);
       }
    }
}
 */
/*Baloon
import java.util.Scanner;
class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[n];
        int count = 0;
        char c = '0';
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for(int i = 0; i<n; i++){
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                c = arr[i];
                break;
            }
        }
        if(c != '0'){
            System.out.println(c);
        }
        else{
            System.out.println("all are even");
        }
    }
}
 */
/*import java.util.Scanner;

class cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i = count; i < n; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
/*import java.util.Scanner;
import java.util.Arrays;

class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            sum = sum + (arr[n - i - 1] - arr[i]);
        }

        System.out.println(sum);

    }
} */
/*
boy or girl
 * import java.util.Scanner;

class cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = new char[s.length()];

        // Copy the characters from the input string to the char array
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        // Count the distinct characters
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }

        // Check if the count of distinct characters is odd or even
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}

 */
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Input: n = 125

        int[] denominations = {100, 20, 10, 5, 1};  // Denominations of bills in descending order

        int numberOfBills = 0;  // Initialize the count of bills to 0

        for (int i = 0; i < denominations.length; i++) {
            int bill = denominations[i];  // Get the current bill denomination

            // Calculate how many of the current bill can be used and update the count
            int count = n / bill;  // For 125 and a 100-dollar bill, count = 125 / 100 = 1
            numberOfBills += count;  // Update the total count of bills
            n %= bill;  // Update the remaining amount after using this denomination
        }

        System.out.println(numberOfBills);  // Output: 4 (Minimum number of bills needed)
    }
}
 */
/*import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class cf {
    public static int findMinClicks(int[][] links, int startPage, int endPage) {
        int n = links.length;
        int[] minClicks = new int[n]; // To store minimum clicks to each page
        boolean[] visited = new boolean[n];

        // Initialize minClicks with a large value (indicating infinity)
        for (int i = 0; i < n; i++) {
            minClicks[i] = Integer.MAX_VALUE;
        }

        // Start from the startPage
        minClicks[startPage - 1] = 0;
        visited[startPage - 1] = true;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(startPage);

        while (!queue.isEmpty()) {
            int currentPage = queue.poll();

            // Explore linked web pages
            for (int linkedPage : links[currentPage - 1]) {
                if (!visited[linkedPage - 1]) {
                    visited[linkedPage - 1] = true;
                    minClicks[linkedPage - 1] = minClicks[currentPage - 1] + 1;
                    queue.offer(linkedPage);
                }
            }
        }

        // Check if it's possible to reach the endPage
        if (minClicks[endPage - 1] == Integer.MAX_VALUE) {
            return -1; // Cannot reach the endPage
        } else {
            return minClicks[endPage - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of web pages: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int[][] links = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter space-separated links for web page " + (i + 1) + ": ");
            String[] linkTokens = scanner.nextLine().split(" ");
            links[i] = new int[linkTokens.length];
            for (int j = 0; j < linkTokens.length; j++) {
                links[i][j] = Integer.parseInt(linkTokens[j]);
            }
        }

        System.out.print("Enter the start web page: ");
        int startPage = scanner.nextInt();
        System.out.print("Enter the end web page: ");
        int endPage = scanner.nextInt();

        int minClicks = findMinClicks(links, startPage, endPage);
        System.out.println("Minimum clicks: " + minClicks);

        scanner.close();
    }
}
 */
/*
 * import java.util.Scanner;

class cf {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int j = 0; j < n; j++) {
			int count = 0;
			String s = "codeforces";
			String c = sc.next();
			for (int i = 0; i < 10; i++) {
				if (s.charAt(i) != c.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
 */
/*import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            String s = scanner.nextLine().toLowerCase().replaceAll("(.)(\\1)+", "$1");

            if (s.equals("meow")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
 */
/*import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            Arr[i] = scanner.nextInt();
        }

        int sumCost = 0;
        while (Arr.length > 1) {
            Arrays.sort(Arr); 
            int cost = Arr[0] + Arr[1]; 
            sumCost += cost; 
            
            int[] newArr = new int[Arr.length - 1];
            newArr[0] = cost;
            for (int i = 2; i < Arr.length; i++) {
                newArr[i - 1] = Arr[i];
            }
            Arr = newArr;
        }
        System.out.println(sumCost);
    }
}
 */
/*minimize the sum
import java.util.Arrays;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            arr[n - 1] = arr[n - 1] / 2;
            Arrays.sort(arr);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
} */
/* logic pyramid
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int currentNumberIndex = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                String formattedNumber = String.format("%05d", 6 + 22 * currentNumberIndex);
                System.out.print(formattedNumber + " ");

                currentNumberIndex++;
            }

            // Move to the next line for the next layer
            System.out.println();
        }
    }
}

*/
/*import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Input: String P (new order)
            String P = scanner.next();

            // Input: String S
            String S = scanner.next();

            // Find matching elements in P and store their positions in an array
            int[] positions = new int[S.length()];
            for (int i = 0; i < S.length(); i++) {
                positions[i] = P.indexOf(S.charAt(i));
            }

            // Sort the positions array
            Arrays.sort(positions);

            // Print the smallest lexicographical string based on the sorted positions
            for (int position : positions) {
                System.out.print(P.charAt(position));
            }

            System.out.println();
        }
    }
}
 */
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int L = scanner.nextInt();  // Length of the binary string
        int K = scanner.nextInt();  // Number of ones in the binary string

        // Calculate the length of the longest consecutive zeros
        int remainingZeros = L - K;
        int maxZeros = remainingZeros > 0 ? 1 : 0;

        // Print the result
        System.out.println(maxZeros);

        // Close the scanner
        scanner.close();
    }
}
 */
/*move zeros at end
 import java.util.Scanner;

class Main{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int count0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count0++;
                continue;
            }
            else{
                System.out.print(arr[i] + ",");
            }
        }
        for (int i = 1; i <= count0; i++) {
            if(i<count0){
                System.out.print(0 + ",");
            }
            else{
                System.out.println(0);
            }
        }
    }
}
 */
/*class practice{
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        long reversed = 0;
        long temp = x;

        while(temp != 0){
            int digit = (int)(temp % 10);
            System.out.println(digit);
            reversed = reversed * 10 + digit;
            System.out.println(reversed);
            temp /= 10;
        }
        return(reversed == x);
    }
    public static void main(String[] args) {
        int s = 123;
        System.out.println(isPalindrome(s));
    }
}
 */
/*
import java.util.HashSet;

class cf{
    public static void main(String[] args) {
        HashSet<Integer>elements = new HashSet<>();

        int arr[] = {1,2,3,3,3,4,5,6,7};

        int count = 0;

        for(int num : arr){
            elements.add(num);
            elements.toArray();
        }
        // for(int num : arr){
        //     if(elements.contains(num))
        //         count++;
        //     System.out.println(count);
        // }
    }
}
 */
/*class cf{
    public static void main(String[] args) {
        
        StringBuilder result = new StringBuilder();

        String a = "1.1.1.1";

        for (char c : a.toCharArray()) {
            if(c == '.'){
                result.append("[.]");
            }
            else{
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
} */
/*import java.util.ArrayList;
class practice{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        int arr1[] = {4,3,2,1};

        int result = 0;
        for (int i = 0; i < arr1.length+1; i++) {
            arr.add(arr1[i]);
            if(i == arr1[arr1.length]){
                result = arr1[arr1.length] + 1;
            }
        }
        arr.add(result);

        for (int i = 0; i < 4; i++) {
            arr.get(i);
        }
    }

} */
/*class practice {
    static int calculate(int mat[][]) {
        int res = 0;
        int n = mat.length;
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            res += mat[i][i] + mat[i][n - i - 1];
        }
        if (n % 2 == 1) {
            res -= mat[mid][mid];
        }
        return res;
    }
    public static void main(String args[]) {

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int result = calculate(mat);

        System.out.println(result);
    }
}
 */
/*import java.util.Arrays;

class ArrayP{
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};

        int n = arr.length;

        boolean visited[] = new boolean[n];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            if(visited[i] == true){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
            
        }
        
    }
} */
/*import java.util.Arrays;
class ArrayP{
    public static void main(String[] args) {
        int arr[] = {10,5,7,24,63,4};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length/2; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length-1; i >= (arr.length/2); i--) {
            System.out.println(arr[i]);
        }
    }
} */
/*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class ArrayP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0,max;
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        max = sum;
        for (int i = 0; i < arr2.length; i++) {
            sum =  sum + arr1[i] - arr2[i];

            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
} */