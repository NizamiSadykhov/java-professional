import java.util.ArrayList;

class Box<T extends Fruit> {
    private final ArrayList<T> mFruits = new ArrayList<>();


    public void addFruit(T fruit) {
        mFruits.add(fruit);
        System.out.println(fruit.getClass().getName());
    }

    public ArrayList<T> getFruits() {
        return mFruits;
    }

    public float getWight() {
        float result = 0;
        for (T fruit : mFruits) {
            result += fruit.getWeight();
        }
        return result;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWight() == box.getWight();
    }

    public void carryOver(Box<? super T> fruits) {
        for (int i = 0; i < mFruits.size(); i++) {
            fruits.addFruit(mFruits.get(i));
            mFruits.remove(mFruits.get(i));
        }
        mFruits.trimToSize();
    }
}

abstract class Fruit {
    private float mWeight = 0;

    public float getWeight() {
        return mWeight;
    }

    public void setWeight(float weight) {

    }
}

class Apple extends Fruit {
    {
        setWeight(1.0f);
    }
}

class Orange extends Fruit {
    {
        setWeight(1.5f);
    }
}

