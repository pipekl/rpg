import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class Warrior extends Hero {

    public Warrior(String nickName) {
        super(nickName);
        super.s = 100;
        super.a = 50;
        super.i = 1;
        super.exp = 0;
        super.hp = 500;
        super.mana = 10;
        super.coordinates = new Mapa();
        super.damage = 150;
        super.items = new ArrayList<>();

    }

    @Override
    public void attack(Enemy enemy) {
        enemy.hp -= getDamage();

    }

    @Override
    public void defense(Enemy enemy) {
        if (enemy.hp > 0)
        hp -= enemy.damage;
    }
    @Override
    public void openItem(Item item) {
        int num = (int) (Math.random() * ((100 - 1) + 1)) + 1;
        System.out.println(num);
        if (num > 50)
            items.add(item);
    }
    @Override
    public void newLevel () {
        s += 10;
        a += 10;
        i += 10;
        hp += 200;
        damage += 20;
    }


 /*
класс должен обладать всеми свойствами героя при создании воин должен обладать следующими характеристиками:
 здоровье - 500, мана - 10, сила - 100, ловкость - 50, интеллект - 1, опыт 0, урон - 150. При атаке герой наносит цели урон и получает урон в ответ от цели, действия повторяются пока кто то не победит. В случае победы герой получает опыт цели, каждые 500 единиц опыта герой получает новый уровень. Новый уровень дает +10 ко всем характеристикам, +200 здоровья и +20 урона.Если воин имеет предмет 1 типа, к его урону добавляется 100.
            Уже мертвая цель - урона герою не наносит!!!
            */
}