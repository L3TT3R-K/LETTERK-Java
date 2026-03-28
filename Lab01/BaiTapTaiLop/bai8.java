import java.util.Scanner;
import java.util.Arrays;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("So luong phan tu phai lon hon 0.");
            sc.close();
            return;
        }
        int[] arr = new int[n];
        nhapMang(sc, arr, n);
        xuatMang(arr);
        System.out.println("Gia tri lon nhat trong mang: " + timMax(arr));
        System.out.println("Gia tri nho nhat trong mang: " + timMin(arr));

        System.out.println("Nhap gia tri can kiem tra: ");
        int x = sc.nextInt();
        kiemTraPhanTu(arr, x);
        System.out.println("So lan xuat hien cua " + x + " trong mang: " + PhanTuBangX(arr, x));
        sapXepMang(arr);
        sc.close(); 
    }
    public static void nhapMang(Scanner sc, int[] arr, int n) {
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int[] arr) {
        System.out.println("Cac phan tu trong mang: " + Arrays.toString(arr));
    }
    public static int timMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int timMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
    public static boolean kiemTraPhanTu(int[] arr, int x) {
        Arrays.sort(arr);
        if(Arrays.binarySearch(arr, x) >= 0) {
            System.out.println("Phan tu " + x + " co ton tai trong mang.");
            return true;
        } else {
            System.out.println("Phan tu " + x + " khong ton tai trong mang.");
            return false;
        }
    }
    public static int PhanTuBangX(int []arr, int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void sapXepMang(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
    }

}
