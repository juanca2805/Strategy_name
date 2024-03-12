package Character;

public class main {
    public static void main(String[] args) {
       
        Character warrior = new Character("Guerrero", 100);
        Character archer = new Character("Arquero", 80);

 
        AttackBehavior meleeAttack = new MeleeAttack();
        AttackBehavior rangedAttack = new RangedAttack();

  
        warrior.performAttack(archer, meleeAttack);

     
        archer.performAttack(warrior, rangedAttack);
    }
}
