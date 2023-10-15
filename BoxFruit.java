import java.util.ArrayList;

public class BoxFruit<T extends Fruit> {

    private ArrayList<T> fruits;

    public BoxFruit(){
        fruits = new ArrayList<>();
    }
    public void addFruit(T fruit){
        fruits.add(fruit);
    }
    public float getWeight(){
        float weight = 0.0f;
        for(T fruit : fruits){
            if(fruit instanceof AppleFruit){
                weight += 1.0f;
            } else if(fruit instanceof OrangeFruit){
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(BoxFruit<?>boxFruit){
        return this.getWeight() == boxFruit.getWeight();
    }

    public void transferFruits(BoxFruit<T>boxFruit){
        if(this == boxFruit){
            return;
        }
        if(!fruits.isEmpty()){
            if(boxFruit.fruits.isEmpty() || fruits.get(0).getClass() == boxFruit.fruits.get(0).getClass()){
                boxFruit.fruits.addAll(fruits);
                fruits.clear();
            }
            else{
                System.out.println("Недьзя пересыпать фрукты разных видов");
            }
        }

    }
    
}
