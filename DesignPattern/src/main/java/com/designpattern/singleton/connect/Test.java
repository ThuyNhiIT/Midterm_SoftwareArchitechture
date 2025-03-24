package com.designpattern.singleton.connect;

public class Test {
        public static void main(String[] args) {
            DatabaseConnection db1 = DatabaseConnection.getInstance();
            db1.query("SELECT * FROM users");

            DatabaseConnection db2 = DatabaseConnection.getInstance();
            db2.query("SELECT * FROM orders");

            System.out.println(db1 == db2); // true: cùng một thể hiện duy nhất
        }
    }
