package com.yurgen.adminAccess;

public class logIn {

    public static void main(String[] args) {
        String[][] users = {{"admin", "123", "ivan Petrov"},
                {"guest", "456", "Guest"}};
        isUsersValid(users);
    }

    static void isUsersValid(String[][] users) {
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                String string = users[i][j];
            }
        }
    }
}