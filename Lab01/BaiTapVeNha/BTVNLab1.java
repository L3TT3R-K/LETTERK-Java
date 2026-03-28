import java.util.Scanner;

// bai 1: nhap vao 2 so nguyen, tim ucln va bcnn cua 2 so do
public class BTVNLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        int gcd = timGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("UCLN cua " + a + " và " + b + " la: " + gcd);
        System.out.println("BCNN cua " + a + " và " + b + " la: " + lcm);

        scanner.close();
    }
    public static int timGCD(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
/*
// bai 2: tim tat ca uoc so cua n
public class BTVNLab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}

// bai 3: nhap tu va mau mot phan so, don gian phan so do, xuat phan so da don gian
public class BTVNLab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap tu so: ");
        int tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        int mau = sc.nextInt();

        int gcd = timGCD(tu, mau);
        tu /= gcd;
        mau /= gcd;

        System.out.println("Phan so da don gian: " + tu + "/" + mau);
    }
    public static int timGCD(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}

// kiem tra so tu nhien la so hoan hao
public class BTVNLab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum+=i;
            }
            }
            if(sum == n){
                System.out.println(n + " la so hoan hao");
            }else{
                System.out.println(n + " khong la so hoan hao");
            }
        }
    }

// bai 5: nhap vao mang so nguyen A(kich thuoc n)
// //  Tạo mảng số nguyên B (kích thước m) với các giá trị ngẫu nhiên. (Hướng dẫn: sử 
// dụng hàm Math.random) 
// 7 
// • Xuất toàn bộ các phần tử của B ra màn hình. 
// • Tạo mảng C từ mảng A (copy A qua C) (Hướng dẫn: sử dụng hàm copyOf) 
// • Thay thế phần tử thứ 1->3 của mảng C bằng 3 phần tử cuối của mảng B (Hướng 
// dẫn: sử dụng hàm System.arraycopy) 
// • Sắp xếp mảng C tăng dần và xuất ra màn hình (Hướng dẫn: sử dụng hàm 
// Arrays.sort()) 
public class BTVNLab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang A: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        System.out.print("Nhap kich thuoc mang B: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = (int)(Math.random() * 100); 
        }
        System.out.println("Mang B: ");
        for(int i = 0; i < m; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
        int[] C = java.util.Arrays.copyOf(A, n);
        System.arraycopy(B, m - 3, C, 0, 3); 
        java.util.Arrays.sort(C);
        System.out.println("Mang C sau khi sap xep: ");
        for(int i = 0; i < n; i++){
            System.out.print(C[i] + " ");
        }
    }
}

// bai 6


public class BTVNLab1 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printMatrix(int[][] A, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        do {
            System.out.print("Nhap so dong n: ");
            n = sc.nextInt();
            System.out.print("Nhap so cot m: ");
            m = sc.nextInt();
        } while (n <= 0 || m <= 0);

        int[][] A = new int[n][m];

        System.out.println("Nhap cac phan tu (0 < A[i][j] < 100):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                do {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = sc.nextInt();
                } while (A[i][j] <= 0 || A[i][j] >= 100);
            }
        }

        int max = A[0][0];
        int row = 0, col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("\nPhan tu lon nhat: " + max + " tai vi tri [" + row + "][" + col + "]");

        System.out.println("\nMa tran so nguyen to (khong phai NT -> 0):");
        int[][] primeMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(A[i][j])) {
                    primeMatrix[i][j] = A[i][j];
                } else {
                    primeMatrix[i][j] = 0;
                }
            }
        }

        printMatrix(primeMatrix, n, m);

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n - 1; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (A[i][j] > A[k][j]) {
                        int temp = A[i][j];
                        A[i][j] = A[k][j];
                        A[k][j] = temp;
                    }
                }
            }
        }

        System.out.println("\nMa tran sau khi sap xep tang dan theo tung cot:");
        printMatrix(A, n, m);

        sc.close();
    }
}
 */
