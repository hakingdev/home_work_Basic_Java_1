import game.hero.Elf;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf();
        elf.setName("Dark Soul");
        elf.setAge(24);
        elf.setId(1);
        elf.setSkill("Hunter");
        elf.setWeapon("Swords");
        System.out.println(
                "Name: " + elf.getName()
                        + "\nAge: " + elf.getAge()
                        + "\nId: " + elf.getId()
                        + "\nSkill: " + elf.getSkill()
                        + "\nWeapon: " + elf.getWeapon()
        );
    }
}