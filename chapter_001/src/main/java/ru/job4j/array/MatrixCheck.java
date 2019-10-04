package ru.job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);

                if (cell == 0 & sign == 'X') {
                    result = true;
                    for (int k = cell; k < board.length; k++) {
                        if(board[row][k] != 'X') {
                            result = false;
                            break;
                        }
                    }
                } else if (row == 0 & sign == 'X') {
                    result = true;
                    for (int k = row; k < board.length; k++) {
                        if(board[k][cell] != 'X') {
                            result = false;
                            break;
                        }
                    }
                }
            }
            System.out.println();
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