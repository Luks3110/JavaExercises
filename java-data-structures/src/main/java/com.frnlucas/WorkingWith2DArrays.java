package com.frnlucas;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }

        char[][] boardTwo = new char[][]{
                new char[] {'0','1','2'},
                new char[] {'0','2','3'},
                new char[] {'0','3','4'}
        };


        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        board[0][1] = 'X';
        board[1][1] = 'X';
        board[2][1] = 'X';
        System.out.println(Arrays.deepToString(boardTwo));
        System.out.println(Arrays.deepToString(board));
    }
}
