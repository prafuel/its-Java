import java.util.Scanner;
import java.util.ArrayList;

class TicTacToeNonAi {
    public static int[][] board = {
            { 2, 2, 2 },
            { 2, 2, 2 },
            { 2, 2, 2 }
    };

    // update the valua at input place for player
    public static int go(int input, int player) {
        
        int i = 0, j = 0;
        if (input < 4) {
            i = 0;
            j = input - 1;
        } else if (input < 7) {
            i = 1;
            j = (input - 1) - 3;
        } else if (input < 10) {
            i = 2;
            j = (input - 1) - 6;
        }

        if (board[i][j] != 2) {
            System.out.println("The position is already filled");
            return 0;
        }
        board[i][j] = player;
        printBoard();
        return 1;
    }

    // take the input from the player
    public static void playerInput(int player) {
        Scanner sc = new Scanner(System.in);

        System.out.println(((player == 5) ? "O" : "X") + " turn to play");
        System.out.println("Enter the number between 1 to 9");
        int input = sc.nextInt();

        if (input <= 0 || input >= 10) {
            System.out.println("invalid input");
            playerInput(player);
        }
        if (go(input, player) == 0) {
            playerInput(player);
        }
    }

    // board is filled or not
    public static int boardFill() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 2) {
                    return 0;
                }
            }
        }
        return 1;
    }

    // printing the board
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j] == 2){
                    System.out.print("| |");
                }
                else if(board[i][j] == 3)
                System.out.print("|X|");
                else if(board[i][j] == 5)
                System.out.print("|O|");
            }
            System.out.println();
            
        }
    }

    // winning position clculating
    public static int posWin(int t) {

        int player;
        ArrayList<Integer> a = new ArrayList<>();
        // int rowMul =1;
        // int colMul =1;
        int dia1 = 1;
        int dia2 = 1;
        for (int i = 0; i < 3; i++) {
            int rowMul = 1;
            int colMul = 1;

            for (int j = 0; j < 3; j++) {
                rowMul *= board[i][j];
                colMul *= board[j][i];
                if (i == j) {
                    dia1 *= board[i][j];
                }
                if (i + j == 2) {
                    dia2 *= board[i][j];
                }
            }
            a.add(rowMul);
            a.add(colMul);

        }
        a.add(dia1);
        a.add(dia2);
        // System.out.println(a);

        if (t == 3) {
            player = 18;
        } else {
            player = 50;
        }

        // row 1
        if (a.indexOf(player) == 0) {
            int i = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 2) {
                    if (j == 0) {
                        return 1;
                    }
                    if (j == 1) {
                        return 2;
                    }
                    if (j == 2) {
                        return 3;
                    }
                }
            }
        }

        // col 1
        if (a.indexOf(player) == 1) {
            int j = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i == 1) {
                        return 4;
                    }
                    if (i == 2) {
                        return 7;
                    }
                }
            }
        }

        // row 2
        if (a.indexOf(player) == 2) {
            int i = 1;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 2) {
                    if (j == 0) {
                        return 4;
                    }
                    if (j == 1) {
                        return 5;
                    }
                    if (j == 2) {
                        return 6;
                    }
                }
            }
        }

        // col 2
        if (a.indexOf(player) == 3) {
            int j = 1;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == 2) {
                    if (i == 0) {
                        return 2;
                    }
                    if (i == 1) {
                        return 5;
                    }
                    if (i == 2) {
                        return 8;
                    }
                }
            }
        }

        // row 3
        if (a.indexOf(player) == 4) {
            int i = 2;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 2) {
                    if (j == 0) {
                        return 7;
                    }
                    if (j == 1) {
                        return 8;
                    }
                    if (j == 2) {
                        return 9;
                    }
                }
            }
        }

        // col 3
        if (a.indexOf(player) == 5) {
            int j = 2;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == 2) {
                    if (i == 0) {
                        return 3;
                    }
                    if (i == 1) {
                        return 6;
                    }
                    if (i == 2) {
                        return 9;
                    }
                }
            }
        }

        // dia 1
        if (a.indexOf(player) == 6) {
            for (int i = 0; i < board[0].length; i++) {
                int j = i;
                if (board[i][j] == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i == 1) {
                        return 5;
                    }
                    if (i == 2) {
                        return 9;
                    }
                }
            }
        }

        // dia 2
        if (a.indexOf(player) == 7) {

            int j = 2;
            for (int i = 0; i < board[0].length; i++) {
                if (board[i][j] == 2) {
                    if (i == 0) {
                        return 3;
                    }
                    if (i == 1) {
                        return 5;
                    }
                    if (i == 2) {
                        return 7;
                    }
                }
                j--;
            }
        }

        return 0;
    }

    public static void makeMove(int n) {

        // O 2st move
        switch (n) {
            case 2:
                if (board[1][1] == 2) {
                    go(5, 5);

                } else {
                    if (board[0][0] == 2) {
                        go(1, 5);

                    }
                }
                break;

            case 4:
                // O 4th Move
                if (posWin(3) != 0) {
            
                    go(posWin(3), 5);

                } else {
                    if (avilable() != 0) {
                        go(avilable(), 5);

                    }

                }

                break;

            case 6:
                // O 6th move
                if (posWin(5) != 0) {
                    go(posWin(5), 5);

                } else if (posWin(3) != 0) {
                    go(posWin(3), 5);

                } else {
                    if (avilable() != 0) {
                        go(avilable(), 5);

                    }

                }
                break;

            case 8:
                // O 8th move
                if (posWin(5) != 0) {
                    go(posWin(5), 5);

                } else if (posWin(3) != 0) {
                    go(posWin(3), 5);

                } else {
                    if (avilable() != 0) {
                        go(avilable(), 5);

                    }
                }

                break;

            default:
                break;
        }

    }

    // avilable
    public static int avilable() {
        if(board[0][0]==board[2][2]){
            if (board[1][0] == 2) {
                return 4;
            }
        }
        else if (board[0][1]==board[1][0]) {
            if (board[1][2] == 2) {
                return 6;
            } 
        }
        if (board[1][1] == 2) {
            return 5;
        } else if (board[0][0] == 2) {
            return 1;
        }else if (board[2][2] == 2) {
            return 9;
        }else if (board[0][1] == 2) {
            return 3;
        }  else if (board[2][0] == 2) {
            return 7;
        } else if (board[0][1] == 2) {
            return 2;
        } else if (board[2][1] == 2) {
            return 8;
        }

        return 0;
    }

    // Win
    public static int win() {
        ArrayList<Integer> a = new ArrayList<>();
        // int rowMul =1;
        // int colMul =1;
        int dia1 = 1;
        int dia2 = 1;
        for (int i = 0; i < 3; i++) {
            int rowMul = 1;
            int colMul = 1;

            for (int j = 0; j < 3; j++) {
                rowMul *= board[i][j];
                colMul *= board[j][i];
                if (i == j) {
                    dia1 *= board[i][j];
                }
                if (i + j == 2) {
                    dia2 *= board[i][j];
                }
            }
            a.add(rowMul);
            a.add(colMul);

        }
        a.add(dia1);
        a.add(dia2);

        if (a.contains(27) == true) {
            // you WIN
            return 1;
        } else if (a.contains(125)) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {

        printBoard();

        int c = 2;

        while (true) {

            playerInput(3);
            if (win() == 1) {
                System.out.println("YOU WIN");
                break;
            }
            if (boardFill() == 1) {
                System.out.println("DRAW");
                break;
            }
            System.out.println("Computer Move");
            makeMove(c);
            if (win() == 0) {
                System.out.println("YOU LOST");
                break;
            }

            c = c + 2;

        }

    }
}