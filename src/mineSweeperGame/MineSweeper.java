package mineSweeperGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int[][] board;
    int[][] map;
    int rowNumber;
    int columnNumber;
    int size;
    boolean status;

    public MineSweeper(int rowNumber, int columnNumber) {

        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.board = new int[this.rowNumber][this.columnNumber];
        this.map = new int[this.rowNumber][this.columnNumber];
        this.size = (this.rowNumber*this.columnNumber); //Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır.

    }

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    void runGame(){

        playMines();
         System.out.println("------GAME START------");
         int userRow, userColumn;
         int counter = 0;
         this.status = true;
         while(this.status){
             showGameBoard(this.board);
             System.out.print("Please enter your row  : ");
             userRow = scanner.nextInt();
             System.out.print("Please enter your column  : ");
             userColumn = scanner.nextInt();
             if ((userRow < 0 || userRow > this.rowNumber - 1) && (userColumn < 0 || userColumn > this.columnNumber - 1)) {
                 //Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
                 System.out.println("Unavailable Coordinates...");
                 continue;
             }
             if (this.map[userRow][userColumn] == -1) {
                 this.status = false;
                 System.out.println("!!!!Game Over!!!");
             } else {
                 checkMine(userRow, userColumn);
                 this.status = true;
                 counter++;
                 if (counter == (this.size - this.size / 4)) { //Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli.
                     System.out.println("Congratulations, you win");
                 break;
                 }
             }

         }
    }


    public void showGameBoard(int[][] gameBoard) {
        for (int[] ints : gameBoard) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (ints[j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public void playMines() {
        int randomRow, randomCol, counter = 0;
        while (counter != (size / 4)) {
            randomRow = random.nextInt(rowNumber);
            randomCol = random.nextInt(columnNumber);
            if (map[randomRow][randomCol] != -1) {
                map[randomRow][randomCol] = -1;
                counter++;
            }

        }
    }


    public void checkMine(int row, int column) {
        //Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz)
        // ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı.
        // Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.

        if ((column < columnNumber - 1) && (this.map[row][column + 1] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((column > 0) && (this.map[row][column - 1] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((row < rowNumber - 1) && (this.map[row + 1][column] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((row > 0) && (this.map[row - 1][column] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((row > 0) && (column > 0) && (this.map[row - 1][column - 1] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((row > 0) && (column < this.columnNumber - 1) && (this.map[row - 1][column + 1] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((row < this.rowNumber - 1) && (column > 0) && (this.map[row + 1][column - 1] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if ((row < this.rowNumber - 1) && (column < this.columnNumber - 1) && (this.map[row + 1][column + 1] == -1)) {
            this.board[row][column] = this.board[row][column] + 1;
        }
        if (board[row][column] == 0) {
            board[row][column] = 0;
        }
    }
}
