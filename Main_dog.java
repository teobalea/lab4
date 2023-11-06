public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "Golden Retriever");
        Dog dog2 = new Dog("Pup", "Labrador");

        dog1.setName("Max");
        dog1.setBreed("German Shepherd");

        dog2.setName("Maxi");
        dog2.setBreed("Poodle");

        System.out.println("Câinele 1: " + dog1.getName() + " (" + dog1.getBreed() + ")");
        System.out.println("Câinele 2: " + dog2.getName() + " (" + dog2.getBreed() + ")");
    }
}
