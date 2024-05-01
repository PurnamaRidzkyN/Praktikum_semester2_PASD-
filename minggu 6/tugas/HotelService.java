package tugas;

public class HotelService {
    Hotel[] rooms;
    int numOfRooms;

    HotelService(int size) {
        rooms = new Hotel[size];
        numOfRooms = 0;
    }

    void tambah(Hotel H) {
        rooms[numOfRooms] = H;
        numOfRooms++;
    }

    void tampilAll() {
        System.out.println("Daftar Penginapan:");
        for (int i = 0; i < numOfRooms; i++) {
            System.out.println("Nama: " + rooms[i].nama + ", Kota: " + rooms[i].kota +
                                ", Harga: " + rooms[i].harga + ", Bintang: " + rooms[i].bintang);
        }
    }

    void bubbleSortByPrice() {
        for (int i = 0; i < numOfRooms-1; i++) {
            for (int j = 0; j < numOfRooms-i-1; j++) {
                if (rooms[j].harga > rooms[j+1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }

    void bubbleSortByStarRating() {
        for (int i = 0; i < numOfRooms-1; i++) {
            for (int j = 0; j < numOfRooms-i-1; j++) {
                if (rooms[j].bintang < rooms[j+1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }

    void selectionSortByPrice() {
        for (int i = 0; i < numOfRooms-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < numOfRooms; j++) {
                if (rooms[j].harga < rooms[minIndex].harga) {
                    minIndex = j;
                }
            }
            Hotel temp = rooms[minIndex];
            rooms[minIndex] = rooms[i];
            rooms[i] = temp;
        }
    }

    void selectionSortByStarRating() {
        for (int i = 0; i < numOfRooms-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < numOfRooms; j++) {
                if (rooms[j].bintang > rooms[maxIndex].bintang) {
                    maxIndex = j;
                }
            }
            Hotel temp = rooms[maxIndex];
            rooms[maxIndex] = rooms[i];
            rooms[i] = temp;
        }
    }
}
