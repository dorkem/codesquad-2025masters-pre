package week2.q3;

import java.util.Stack;

public class Maze {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 0}
        };

        int startX = 0, startY = 0, endX = 7, endY = 7;

        path(maze, startX, startY, endX, endY);
    }

    public static void path(int[][] maze, int startX, int startY, int endX, int endY){
        int row = maze.length;
        int col = maze[0].length;
        boolean[][] visited = new boolean[row][col];

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX, startY});
        visited[startX][startY] = true;

        while(!stack.isEmpty()){
            int[] current = stack.peek();
            int x = current[0];
            int y = current[1];

            if(x == endX && y == endY){
                for (int[] position : stack) {
                    System.out.print("(" + position[0] + ", " + position[1] + ") -> ");
                }
                return;
            }

            boolean moved = false;
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < row && ny >= 0 && ny < col && maze[nx][ny] == 0 && !visited[nx][ny]){
                    stack.push(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    moved = true;
                    break;
                }
            }

            if(!moved) {
                stack.pop();
            }
        }
        System.out.println("출구를 찾을 수 없습니다.");
    }
}
