package _01_sea_creature;
public class SeaCreaturerunner {
public static void main(String[] args) {
	
SeaCreature Spongebob = new SeaCreature("Spongebob");
SeaCreature Patrick = new SeaCreature("Patrick");
SeaCreature Squidward = new SeaCreature("Squidward");

Spongebob.eat();
Spongebob.laugh();

Patrick.eat();
Patrick.laugh();
System.out.println("my name is Patrick");

Squidward.eat();
Squidward.laugh();
System.out.println("my name is Squidward");

}
}

