package exercise2;

import java.util.*;

public class Colors {

    String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red",
        // "yellow", "green", "blue", etc.) return an array of strings that start with a
        // color. discard all the other strings. If no strings start with a color in the
        // input array, return an empty array.
        return new String[] {};
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[] { "bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey",
                "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah" });
        String[] strings = new String[] { "bluebird", "red herring", "yellow bumblebee", "black spider", "green monkey",
                "pink", "great gatsby", "feeding frenzy", "black bird", "widowmaker", "quran", "bible", "torah" };
        System.out.println(code.onlyColors(strings));
        System.out.println("This is the Colors class");

    }

    public boolean isColor(String string) {
        if (string.contains("blue")) {
            return true;
        } else if (string.contains("red")) {
            return true;
        } else if (string.contains("yellow")) {
            return true;
        } else if (string.contains("black")) {
            return true;
        } else if (string.contains("green")) {
            return true;
        } else if (string.contains("pink")) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> onlyColors(String[] strings) {
        ArrayList<String> colors = new ArrayList<String>();
        for (String string : strings) {
            if (isColor(string)) {
                colors.add(string);
            }
        }
        return colors;
    }
}