public class Main {
    public static void main(String[] args) {
       Magic magic = new Magic();
       magic.applySuperAbility("Lightning");
       Medic medic = new Medic();
       medic.applySuperAbility("Treatment");
       Warrior warrior = new Warrior();
       warrior.applySuperAbility("Critical damage");
       HavingSuperAbility[] havingSuperAbilities = {magic, medic, warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
          havingSuperAbilities[i].applySuperAbility();
            if (havingSuperAbilities[i] instanceof Hero){
                ((Hero)havingSuperAbilities[i]).applySuperAbility();
            }
        }



    }
}