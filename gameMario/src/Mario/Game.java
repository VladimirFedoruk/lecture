package Mario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private int getDirection() {
        int direction = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            direction = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
        return direction;
    }
​
    public class Mario {
        int x =9;
        int y =0;
​
        Mario(int x, int y) {
            this.x = x;
            this.y = y;
        }
        private void run(int direction){
            switch (direction){
                case 8:
​
            }
        }
    }

    public class Map {
        int[][] Map = new int[10][10];
​
        int persent;
​
        public void init(int persent) {
​
            for (int i = 0; i < Map.length; i++) {
                for (int j = 0; j < Map.length; j++) {
                    double random = (Math.random() * 100);
                    if (random > persent)
                        Map[i][j] = 0;
                    else Map[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
​
        int i = game.getDirection();
        System.out.println(i);
    }

}
