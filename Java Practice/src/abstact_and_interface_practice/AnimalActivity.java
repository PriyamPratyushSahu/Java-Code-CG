package abstact_and_interface_practice;

    abstract class animal {
        int count = 10;
        public void sound(String soundInput) {
            System.out.println("Sound: " + soundInput);
        }
        public abstract void food(String foodType);
    }

    class Dog extends animal{

        public void food(String foodType) {
        }
    }

class AnimalActivity{
}