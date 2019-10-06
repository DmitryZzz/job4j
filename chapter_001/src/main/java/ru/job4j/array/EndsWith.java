package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (word.length == 0 | post.length == 0) {
            return false;
        }
        for (int i = post.length - 1; i >= 0; i--) {
            if (post[i] != word[word.length - (post.length - i)]) {
                result = false;
                break;
            }
        }
        return result;
    }
}