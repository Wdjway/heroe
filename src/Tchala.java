public class Tchala extends SuperHero {

    // 6 ATRIBUTOS

    public String nameHero;

    public int Age;

    public int ID;

    public String Bodycolor;

    public String eyesColor;

    public String Email;


// CONSTRUCTOR

    public Tchala (int health, int energy){
        this.health= health;
        this.energy= energy;


    }
    // SUPER PODERES
    public void superPower() {
        jump();
        fly();
        expansivewave();
        flyAttack();
        attack();
        hyperSpeed();
        talk();

    }


    //3 METODOS


    public void expansivewave() {
        System.out.println("a massive explosive of energy");
        System.out.println("your energy low to "+ (energy = energy-18));


    }

   public void flyAttack(){
        fly();
       System.out.println("your energy low to"+ (energy= energy - 32));
    }

 // ATTACK
 public void attack(){
     health= health- 20;
     System.out.println("you was attaked your health "+ health);
 }


// IMPLEMENTANDO INTERFACE
    @Override
    public void fly() {
        System.out.println("He lifts his opponent high and smashes him to the ground ");

    }

    @Override
    public void hyperSpeed() {

    }

    @Override
    public void move() {

    }

    @Override
    public void jump() {
        System.out.println("jumps very tall and ");
        System.out.println("your energy low to "+ (energy = energy- 23));
    }

    @Override
    public void talk() {

    }















}






