import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            if (stack.isEmpty()) {
                
                int column = moves[i] - 1;
                
                for (int k = 0; k < board.length; k++) {
                    if (board[k][column] == 0) continue;
                    else {
                        stack.push(board[k][column]);
                        board[k][column] = 0;
                        break;
                    }
                }
            } else {
                int piled = stack.peek();
                
                int column = moves[i] - 1;
                
                for (int k = 0; k < board.length; k++) {
                    if (board[k][column] == 0) continue;
                    else {
                        if (piled == board[k][column]) {
                            answer += 2;
                            stack.pop();
                            board[k][column] = 0;
                            break;
                        } else {
                            stack.push(board[k][column]);
                            board[k][column] = 0;
                            break;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}