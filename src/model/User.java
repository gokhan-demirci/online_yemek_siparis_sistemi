package model;

import java.time.LocalDateTime;

/**
 * Kullanıcıların temel özelliklerini tutan ata sınıf (Base Class).
 * Kalıtım (Inheritance) prensibi için temel teşkil eder.
 */
public class User {
    // Encapsulation: Değişkenler private, erişim metotlarla sağlanır.
    private String name;
    private String email;
    private String phone;
    private LocalDateTime createdAt;

    /**
     * User sınıfı kurucu metodu (Constructor).
     * @param name Kullanıcının adı soyadı
     * @param email Kullanıcı e-posta adresi
     * @param phone Kullanıcı telefon numarası
     */
    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createdAt = LocalDateTime.now(); // Kayıt anını otomatik alır
    }

    // Getter ve Setter Metotları
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}