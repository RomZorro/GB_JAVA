// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.

// Sample Input:

// 8
// 11
// Sample Output:

// 512
// 1331

// Task_2. 

package HW;
import java.util.Scanner;
public class HW1_1 {
    public static void main(String[] args) {
        int[] cubes = new int[1000];
        for (int i = 1; i <= 1000; i++) {
        cubes[i-1] = i * i * i;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int[] results = getCubes(cubes, a, b);
        System.out.println("Куб первого числа: " + results[0]);
        System.out.println("Куб второго числа: " + results[1]);
        }
        int[] cubes = new int[1000];{
        for (int i = 1; i <= 1000; i++) {
        cubes[i-1] = i * i * i;
    }
        }
        public static int[] getCubes(int[] cubes, int a, int b) {
            int[] results = new int[2];
            results[0] = cubes[a-1];
            results[1] = cubes[b-1];
            return results;
            }
    }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] cubs = new int[1000];
//         for (int i = 0; i < 1000; i++) {
//             cubs[i] = (i + 1) * (i + 1) * (i + 1);
//         }
//         System.out.print("Введите первое число: ");
//         int num1 = sc.nextInt();
//         System.out.print("Введите второе число: ");
//         int num2 = sc.nextInt();
//         int cub1 = cubs[num1 - 1];
//         int cub2 = cubs[num2 - 1];
//         System.out.println("Куб первого числа: " + cub1);
//         System.out.println("Куб второго числа: " + cub2);
//         sc.close();
//     }

// }
    
