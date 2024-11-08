package org.example;

public class SingleResponsibility {

    public static void main(String[] args) {

    }
}

class User {
    private String name;
    private String email;
    private String password;

    // ... конструктор и геттеры/сеттеры ...
}

class RegistrationService {
    public void register(String name, String email, String password) {
        // ... логика регистрации ...
    }
}

class AuthenticationService {
    public void authenticate(String email, String password) {
        // ... логика авторизации ...
    }
}

class PasswordResetService {
    public void resetPassword() {
        // Логика по восстановлению пароля
    }
}
