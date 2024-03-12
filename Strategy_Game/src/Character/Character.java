package Character;


public class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        System.out.println(name + " recibió " + damage + " puntos de daño. Salud restante: " + health);
    }

    public void performAttack(Character target, AttackBehavior attackBehavior) {
        attackBehavior.attack(target);
    }
}
