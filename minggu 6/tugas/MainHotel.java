package tugas;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService(5);

        // Tambahkan beberapa hotel
        hotelService.tambah(new Hotel("Hotel A", "Surabaya", 500000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel B", "Jakarta", 800000, (byte) 5));
        hotelService.tambah(new Hotel("Hotel C", "Bandung", 400000, (byte) 3));
        hotelService.tambah(new Hotel("Hotel D", "Yogyakarta", 600000, (byte) 4));
        hotelService.tambah(new Hotel("Hotel E", "Bali", 1000000, (byte) 5));

        // Tampilkan daftar penginapan sebelum diurutkan
        System.out.println("Daftar Penginapan sebelum diurutkan:");
        hotelService.tampilAll();
        System.out.println();

        // Urutkan daftar penginapan berdasarkan harga dengan Bubble Sort
        hotelService.bubbleSortByPrice();
        System.out.println("Daftar Penginapan setelah diurutkan berdasarkan harga (Bubble Sort):");
        hotelService.tampilAll();
        System.out.println();

        hotelService.selectionSortByPrice();
        System.out.println("Daftar Penginapan setelah diurutkan berdasarkan harga (Selection Sort):");
        hotelService.tampilAll();
        System.out.println();

        // Urutkan daftar penginapan berdasarkan rating bintang dengan Selection Sort
        hotelService.selectionSortByStarRating();
        System.out.println("Daftar Penginapan setelah diurutkan berdasarkan rating bintang (Selection Sort):");
        hotelService.tampilAll();

        hotelService.bubbleSortByStarRating();
        System.out.println("Daftar Penginapan setelah diurutkan berdasarkan rating bintang (Bubble Sort):");
        hotelService.tampilAll();
    }
}
