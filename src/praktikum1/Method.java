package praktikum1;
public class Method {
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    private double berat;
    //method untuk nilai maxPenumpang
    public Method(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method untuk menambah penumpang dan berat badannya
    public void addPenumpang(double penumpang, double berat){
        double temp, penumpangBaru;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
        }
        penumpangBaru = this.berat + berat;
        this.berat = penumpangBaru;
    }
    //method untuk input password
    public void getPenumpang(double password)
    {
        if (password == 24) 
        {
            System.out.println("Password Benar");
        }
        else 
        {
            System.out.println("Password Salah");
        }
    }
    //method untuk menghitung rata-rata berat badan
    public void getAvarage(){
        counter = berat / penumpang;
    }
    public void cetakpenumpang() 
    {
        System.out.println("penumpang Bus Sekarang = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxPenumpang);
        System.out.println("Berat seluruh penumpang = "+berat);
        System.out.println("Rata-rata berat penumpang = "+counter);
    }
}
