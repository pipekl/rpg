import java.util.ArrayList;
import java.util.Map;

abstract class Hero {

    protected String nickName;
    protected int s, a, i, exp, hp, mana; // сила ловкость интеллект опыт здоровье мана
    protected Mapa coordinates; // координаты героя на карте
    protected ArrayList<Item> items = new ArrayList<>(); // список поднятых предметов
    protected int damage; // урон

    public Hero(String nickName) {
        this.nickName = nickName;
        this.s = s;
        this.a = a;
        this.i = i;
        this.exp = exp;
        this.hp = hp;
        this.mana = mana;
        this.items = items;
        this.damage = damage;
    }

    public int getMana(){
        return mana;
    }
    public int getDamage(){
        return damage;
    }
    public int getHp(){
        return hp;
    }
    public Mapa getCoordinates() {
        return coordinates;
    }
//    public void goToCursor(int xx, int yy){
//        x = xx; y = yy; }

    public abstract void attack(Enemy enemy); // этот метод должен быть определен в классах наследниках

    public abstract void defense(Enemy enemy);// этот метод должен быть определен в классах наследниках

    public abstract void openItem(Item item);
        // метод должен добавлять предмет в список с вероятностью 50 %
        // для осуществления вероятностных процессов можно использовать случайное число от 0 до 100.

    public void newExp(Enemy enemy) {
        int lvl = exp/500;
        exp += enemy.exp;
        if (exp/500 > lvl)
            while (exp/500 != lvl) {
                newLevel();
                lvl++;
            }
    }
    public abstract void newLevel();


}