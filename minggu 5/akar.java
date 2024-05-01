public class akar{
    public double nilai;

    
    public double akarBF() {
        double akar = 0;
        while (akar * akar <= nilai) {
            akar += 0.1; 
        }
        return akar;
    }

    public double akarDC() {
        double epsilon = 0.1; // Akurasi yang diinginkan
        double batasBawah = 0;
        double batasAtas = nilai;
        double akar = 0;

        while (batasAtas - batasBawah > epsilon) {
            akar = (batasBawah + batasAtas) / 2;
            double kuadrat = akar * akar;
            if (kuadrat < nilai) {
                batasBawah = akar;
            } else if (kuadrat > nilai) {
                batasAtas = akar;
            } else {
                return akar;
            }
        }
        return akar;
    }

   
}
