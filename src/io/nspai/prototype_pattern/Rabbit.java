package io.nspai.prototype_pattern;

public class Rabbit implements Cloneable{

    public enum Breed{
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH,
        CONGOLESE_SUNGURA
    }

    private int age;
    private Breed breed;

    public Rabbit(){
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    protected Rabbit clone() {
        try {
            return (Rabbit) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new AssertionError();
        }
    }
}
