import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> list = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            int a = line[i][0];
            int b = line[i][1];
            int e = line[i][2];

            for (int k = i + 1; k < line.length; k++) {
                int c = line[k][0];
                int d = line[k][1];
                int f = line[k][2];

                if (isNonAcross(a, b, c, d)) continue;
                else {
                    long underX = ((long) a * d - (long) b * c);
                    long topX = ((long) b * f - (long) e * d);

                    long underY = ((long) a * d - (long) b * c);
                    long topY = ((long) e * c - (long) a * f);

                    if (Math.abs(topX) % Math.abs(underX) > 0 || Math.abs(topY) % Math.abs(underY) > 0) continue;
                    else {
                        long xPoint = topX / underX;
                        long yPoint = topY / underY * -1;


                        list.add(new Point(xPoint, yPoint));
                    }
                }
            }
        }

        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            long x = list.get(i).x;
            long y = list.get(i).y;

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        long OFFSET_X = minX;
        long OFFSET_Y = minY;

        int rangeX = (int) (maxX - OFFSET_X + 1);
        int rangeY = (int) (maxY - OFFSET_Y + 1);

        char[][] board = new char[rangeY][rangeX];

        for (int i = 0; i < rangeY; i++) {
            Arrays.fill(board[i], '.');
        }

        for (int i = 0; i < list.size(); i++) {
            int x = (int) (list.get(i).x - OFFSET_X);
            int y = (int) (list.get(i).y - OFFSET_Y);

            board[y][x] = '*';
        }

        String[] ans = new String[rangeY];

        for (int i = 0; i < rangeY; i++) {
            ans[i] = String.valueOf(board[i]);
        }

        return ans;
    }

    public boolean isNonAcross(int a, int b, int c, int d) {
        if ((long) a * (long) d - (long) b * (long) c == 0) return true;

        return false;
    }

    public class Point {
        public long x;
        public long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}