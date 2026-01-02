import model.User;

public class Main {
    public static void main(String[] args) {
        // Test amaçlı bir User nesnesi oluşturuyoruz
        User user1 = new User("Ahmet Yılmaz", "ahmet@mail.com", "555-1234");
        System.out.println("Sistem Başlatıldı: " + user1.toString());
    }
}