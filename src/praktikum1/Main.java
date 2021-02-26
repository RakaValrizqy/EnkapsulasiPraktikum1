package praktikum1;
public class Main {
    public static void main(String[] args) {
        //konstruktor dari class method
        Method bus = new Method(12);
        bus.getPenumpang(24);
        bus.addPenumpang(2, 160);
        bus.addPenumpang(3, 120);
        bus.getAvarage();
        bus.cetakpenumpang();
    }
    
}
