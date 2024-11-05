public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    // Tukar elemen jika elemen saat ini lebih kecil dari elemen berikutnya
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {23, 35, 14, 7, 67, 89, 20};

        System.out.println("Data sebelum diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        bubbleSort(data);

        System.out.println("\nData setelah diurutkan dari besar ke kecil:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
