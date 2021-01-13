import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите имя персонажа:");
        Enter enter = new Enter();


        Hero myHero = new Warrior(enter.name(scan));
        // Hero myHero = new Archer();
        // Hero myHero = new Magician();
        System.out.println("Ваше имя: " + myHero.nickName);

        Mapa ff = new Mapa();
        ff.getMap(myHero);
        int mov;
        while (myHero.hp > 0) {
            do {
                System.out.println("Выберете направление: ");
                ff.getMove();
                mov = enter.moveWhere(scan);
            }
            while (mov == 0);
            ff.moveNumber(mov);
            ff.getMap(myHero);
        }

        Thread.sleep(30000);
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy(30, 20, 1200)); // 1 - Крестьянин
        enemies.add(new Enemy(2018, 1, 350)); // 2 - Стая собак
        enemies.add(new Enemy(280, 50, 3050)); // 3 - Вор
        enemies.add(new Enemy(100500, 100500, 100500)); // 4 - Берсерк

        //найден клад
        for (int i = 0; i < 300; i++) {
            Item item = new Item(0, 0, i % 3); // i%3 - будет задавать предмету тип 0, 1, 2
            myHero.openItem(item);  // герои получает предмет в руки
        }
        System.out.println("Всего собрано: " + myHero.items.size());

        // бой!
        int count = 1;
        for (Enemy enemy : enemies) {
            System.out.println(count++ + "-й бой:");
            System.out.println("  Герои { hp=" + myHero.hp + " mana=" +
                    myHero.mana + " }");
            System.out.println("  Враг { hp=" + enemy.hp + " }");
            int counter = 1;
            while (myHero.hp > 0 & enemy.hp > 0) {
                Thread.sleep(3000);
                System.out.println(counter++ + " раунд:");
                myHero.attack(enemy);
                myHero.defense(enemy);
                System.out.println("    Герои { hp=" + myHero.hp + " mana=" + myHero.mana + " }");
            System.out.println("    Враг { hp=" + enemy.hp + " }");
        }
           if (myHero.hp > 0)
               myHero.newExp(enemy);
        System.out.println(myHero.hp > 0 ? "Победа, герой получил опыт " + enemy.exp : "Поражение");
                System.out.printf("Герой { HP=%d, MANNA=%d, damage=%d, exp=%d }\n", myHero.hp, myHero.mana, myHero.damage, myHero.exp);
}
        }
                }