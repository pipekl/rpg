import java.util.Arrays;

public class Mapa {
    String [][] map = {{"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","_YOU_","I___I","I___I","I___I","I___I"},
            {"I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I","I___I"},};

    public String[][] getMap() {
        return map;
    }

    public void setMap(String[][] map) {
        this.map = map;
    }

    public void getMap (Hero hero) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }


    public void moveNumber (int num) {
        if (num == 1)
            moveUp();
        if (num == 2)
            moveDown();
        if (num == 3)
            moveLeft();
        if (num == 4)
            moveRight();
    }

    public void moveUp() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i - 1 >= 0 && map[i][j].equals("_YOU_")) {
                    String temp = map[i][j];
                    map[i][j] = map[i-1][j];
                    map[i-1][j] = temp;
                    i = map.length;
                    break;
                }
            }
        }
    }

    public void moveDown() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (i+1 <= map.length-1 && map[i][j].equals("_YOU_")) {
                    String temp = map[i][j];
                    map[i][j] = map[i+1][j];
                    map[i+1][j] = temp;
                    i = map.length;
                    break;
                }
            }
        }
    }

    public void moveLeft() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (j-1 >= 0 && map[i][j].equals("_YOU_")) {
                    String temp = map[i][j];
                    map[i][j] = map[i][j-1];
                    map[i][j-1] = temp;
                    i = map.length;
                    break;
                }
            }
        }
    }

    public void moveRight() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (j+1 <= map.length-1 && map[i][j].equals("_YOU_")) {
                    String temp = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = temp;
                    i = map.length;
                    break;
                }
            }
        }
    }


    public void getMove() {
        boolean left = false;
        boolean right = false;
        boolean up = false;
        boolean down = false;

        int a = 0;
        int b = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("_YOU_")) {
                    a = i;
                    b = j;
                }
            }
        }
        if (a >= 0)
            down = true;
        if (a <= 9)
            up = true;
        if (b >= 0)
            right = true;
        if (b <= 9)
            left = true;

        if (up)
            System.out.println("1 - Вверх");
        if (down)
            System.out.println("2 - Вниз");
        if (left)
            System.out.println("3 - Влево");
        if (right)
            System.out.println("4 - Вправо");
    }
}
