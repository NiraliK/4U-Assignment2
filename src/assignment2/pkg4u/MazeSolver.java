/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg4u;

/**
 *
 * @author niralikantaria
 */
public class MazeSolver {

    public void printMaze(char[][] maze) {
        //go through all the row
        for (int i = 0; i < maze.length; i++) {
            //looping through the rows 
            for (int j = 0; j < maze[i].length; j++) {
                //printing the current location 
                System.out.print(maze[i][j]);
            }
            //move to the next line for printing 
            System.out.println("");
        }
    }

    public boolean solveMaze(char[][] maze, int row, int col) {
        //did i find the end? 
        if (maze[row][col] == 'e') {
            printMaze(maze);
            return true;
        }
        //am i off the mat?
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[0].length) {
            return false;
        }
        //is this a bad spot?
        if (maze[row][col] == '+'
                || maze[row][col] == 'w') {
            return false;
        }
        //i'm on a valid location!
        //mark I've been here!
        maze[row][col] = '+';
        //check north!
        boolean check = solveMaze(maze, row - 1, col);
        //did it work!
        if (check) {
            return true;

        }

        //check east 
        check = solveMaze(maze, row, col + 1);
        if (check) {
            return true;
        }

        //check south 
        check = solveMaze(maze, row + 1, col);
        if (check) {
            return true;
        }

        //check west 
        check = solveMaze(maze, row, col - 1);
        if (check) {
            return true;
        }
        maze[row][col] = '.';
        return false;

    }

    public static void main(String[] args) {
        // char[][] maze =  new char[10][10];
        char[][] maze = {{'w', 'w', 'w', 'w', '.', '.'},
        {'s', '.', 'w', '.', 'w', '.'},
        {'w', '.', 'w', '.', 'w', '.'},
        {'w', '.', '.', '.', '.', '.'},
        {'w', 'w', 'w', 'e', 'w', 'w'}};

        //testing the maze 
        MazeSolver test = new MazeSolver();
        test.printMaze(maze);
        System.out.println("");
        test.solveMaze(maze, 1, 0);

    }

}
