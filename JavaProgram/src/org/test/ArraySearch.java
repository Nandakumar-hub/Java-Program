package org.test;

public class ArraySearch {
    public static void main(String[] args) {
        String[] elementIDs = {"btnLogin", "txtUsername", "txtPassword", "btnLogout"};
        String searchID = "txtUsenrame";
        boolean found = false;

        for (int i = 0; i < elementIDs.length; i++) {
            if (elementIDs[i].equals(searchID)) {
                System.out.println(searchID + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchID + " not found.");
        }
    }
}