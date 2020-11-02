// An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis. People must adopt either the "oldest" of all animals at the shelter,
// or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like .
// Create the data structures to maintain this system and implement operations such as enque, dequeueAny, dequeueDog, and dequeueCat. You may use the built-in LinkedList data structure.

// Sounds like queue implementation

import java.util.LinkedList;

public class QuestionSix {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enque("dog", "dog1");
        animalShelter.enque("cat", "cat1");
        animalShelter.enque("dog", "dog2");
        System.out.println(animalShelter.dequeCat().name);
    }
}

class AnimalShelter {
    public LinkedList<Animal> list;

    public AnimalShelter() {
        list = new LinkedList<>();
    }

    public void enque(String breed, String name) {
        Animal newAnimal = new Animal(breed, name);
        list.add(newAnimal);
    }

    public Animal dequeAny() {
        return list.remove();
    }

    public Animal dequeDog() {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).breed == "dog") {
                return list.remove(i);
            }
        }
        return null;
    }

    public Animal dequeCat() {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).breed == "cat") {
                return list.remove(i);
            }
        }
        return null;
    }
}

class Animal {
    public String breed;
    public String name;

    public Animal(String breed, String name) {
        this.name = name;
        this.breed = breed;
    }
}
