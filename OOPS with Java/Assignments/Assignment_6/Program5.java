package a6;
import java.util.*;
public class Program5 {
public static int[] findIntersection(int[] a1, int[] a2) {
Arrays.sort(a1);
Arrays.sort(a2);
int i = 0, j = 0;
int[] tempIntersection = new int[Math.min(a1.length, a2.length)];
int index = 0;
while (i < a1.length && j < a2.length) {
if (a1[i]<a2[j]) {
i++;
	} 
else if (a1[i]>a2[j]) {
j++;
	} 
else{
if (index == 0 || tempIntersection[index - 1] != a1[i]) {
tempIntersection[index++] = a1[i];
}
i++;
j++;
		}
}
return Arrays.copyOf(tempIntersection, index);
}
public static void main(String[] args) {
int[] array1 = {4, 9, 5, 1};
int[] array2 = {9, 4, 9, 8, 4};
int[] intersection = findIntersection(array1, array2);
System.out.println(Arrays.toString(intersection));

	}

}
