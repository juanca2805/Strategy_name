package Character;

public class MeleeAttack implements AttackBehavior {
    @Override
    public void attack(Character target) {
        System.out.println("¡Ataque cuerpo a cuerpo!");
        int damage = 10;
        target.receiveDamage(damage);
    }
}
