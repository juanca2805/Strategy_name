package Character;

public class RangedAttack implements AttackBehavior {
    @Override
    public void attack(Character target) {
        System.out.println("¡Ataque a distancia!");
        int damage = 5;
        target.receiveDamage(damage);
    }
}
