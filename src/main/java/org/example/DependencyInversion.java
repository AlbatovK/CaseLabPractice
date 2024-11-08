package org.example;

interface DatabaseConnection {
    void connect(String databaseUrl, String username, String password);

    void executeQuery(String query);
}

class MySQlConnection implements DatabaseConnection {
    @Override
    public void connect(String databaseUrl, String username, String password) {
        System.out.println("MySQL!");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println(query + "MySQL!");
    }
}

class PostgresConnection implements DatabaseConnection {
    @Override
    public void connect(String databaseUrl, String username, String password) {
        System.out.println("Postgres");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println(query + "Postgres");
    }
}

class TestConnection implements DatabaseConnection {
    @Override
    public void connect(String databaseUrl, String username, String password) {
        System.out.println("test");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("test");
    }
}

class Database {
    private String databaseUrl;
    private String username;
    private String password;

    private DatabaseConnection connection;

    public Database(String databaseUrl, String username, String password, DatabaseConnection connection) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
        this.connection = connection;
    }

    public void connect() {
        connection.connect(this.databaseUrl, this.username, this.password);
    }

    public void executeQuery(String query) {
        connection.executeQuery(query);
    }
}

class Main {
    public static void main(String[] args) {
        Database database = new Database(
                "jdbc:mysql://localhost:3306/mydatabase",
                "user",
                "password",
                new PostgresConnection()
        );

        database.connect();
        database.executeQuery("SELECT * FROM users");
    }
}

