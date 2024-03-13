class Solution {
    
    public int[] crossX = {0, 1, 0, -1};
    public int[] crossY = {-1, 0, 1, 0};

    public int[] diagonalX = {1, 1, -1, -1};
    public int[] diagonalY = {-1, 1, 1, -1};

    public int[][] compDiaX = {{0, 1}, {1, 0}, {-1, 0}, {-1, 0}};
    public int[][] compDiaY = {{-1, 0}, {0, 1}, {0, 1}, {0, -1}};

    public int[] cross2X = {0, 2, 0, -2};
    public int[] cross2Y = {-2, 0, 2, 0};
    
    public int[] solution(String[][] places) {
        int[] result = new int[places.length];

        for (int i = 0; i < places.length; i++) {

            String[] place = places[i];
            char[][] board = new char[5][5];

            for (int k = 0; k < 5; k++) {
                char[] list = place[k].toCharArray();

                for (int j = 0; j < 5; j++) {
                    board[k][j] = list[j];
                }
            }

            boolean isSafe = true;
            for (int k = 0; k < 5; k++) {
                for (int j = 0; j < 5; j++) {

                    if (board[k][j] == 'P') {
                        for (int z = 0; z < 4; z++) {
                            int nx = j + crossX[z];
                            int ny = k + crossY[z];

                            if (isRange(nx, ny) && board[ny][nx] == 'P') {
                                isSafe = false;
                            }
                        }
                        
                        for (int z = 0; z < 4; z++) {
                            int nx = j + diagonalX[z];
                            int ny = k + diagonalY[z];
                            
                            if (isRange(nx, ny) && board[ny][nx] == 'P') {
                                for (int l = 0; l < 2; l++) {
                                    int nx2 = j + compDiaX[z][l];
                                    int ny2 = k + compDiaY[z][l];
                                    
                                    if (isRange(nx2, ny2) && board[ny2][nx2] != 'X') {
                                        isSafe = false;
                                    }
                                }
                            }
                        }

                        for (int z = 0; z < 4; z++) {
                            int nx = j + cross2X[z];
                            int ny = k + cross2Y[z];

                            int middleX = j + crossX[z];
                            int middleY = k + crossY[z];

                            if (isRange(nx, ny) && board[ny][nx] == 'P' && board[middleY][middleX] != 'X') {
                                isSafe = false;
                            }
                        }
                    }
                }
            }

            if (isSafe) result[i] = 1;
        }

        return result;
    }
    
    public boolean isRange(int x, int y) {
        if (x >= 0 && x < 5 && y >= 0 && y < 5) return true;
        
        return false;
    }
}