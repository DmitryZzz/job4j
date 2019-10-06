package ru.job4j.array;

/**
 * Class MatrxCheck.
 *
 * @author Dmitry Zimin
 * @version 3
 * @since 2019-10-04
 */
public class MatrixCheck {

    /**
     * Метод проверяет, что по горизонтали или вертикали все символы = X
     *
     * @param board массив типа char
     * @return true or false
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int counterH, counterV;
        for (int row = 0; row < board.length; row++) {
            char sign = board[row][row];
            if (sign == 'X') {
                counterV = 0;
                counterH = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[row][i] == 'X') {
                        counterV++;
                    }
                    if (board[i][row] == 'X') {
                        counterH++;
                    }
                }
                if (counterH == board.length | counterV == board.length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinVertical2 = {
                {'_', '_', '_', '_', 'X'},
                {'_', '_', '_', '_', 'X'},
                {'_', '_', '_', '_', 'X'},
                {'_', '_', '_', '_', 'X'},
                {'_', '_', '_', '_', 'X'},
        };
        win = isWin(hasWinVertical2);
        System.out.println("A board has a winner : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] hasWinHor2 = {
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'}
        };
        winHor = isWin(hasWinHor2);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
        System.out.println();
        char[][] notWin2 = {
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'X', '_', 'X', 'X', 'X'}
        };
        lose = isWin(notWin2);
        System.out.println("A board has a winner : " + lose);
    }
}