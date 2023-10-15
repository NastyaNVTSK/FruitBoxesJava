import javax.swing.Box;

public class Main {

    public static void main(String [] args){

    BoxFruit<AppleFruit> appleBox1 = new BoxFruit<>();
        appleBox1.addFruit(new AppleFruit());
        appleBox1.addFruit(new AppleFruit());
        System.out.println("Вес коробки с яблоками1: " + appleBox1.getWeight());

        BoxFruit<AppleFruit> appleBox2 = new BoxFruit<>();
        appleBox2.addFruit(new AppleFruit());
        System.out.println("Вес коробки с яблоками2: " + appleBox2.getWeight());
        System.out.println("Сравнение коробки с яблоками1 и коробки с яблоками2: " + appleBox1.compare(appleBox2));

        BoxFruit<OrangeFruit> orangeBox = new BoxFruit<>();
        orangeBox.addFruit(new OrangeFruit());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Сравнение коробки с яблоками1 и коробки с апельсинами: " + appleBox1.compare(orangeBox));

        BoxFruit<AppleFruit> appleBox3 = new BoxFruit<>();
        appleBox3.addFruit(new AppleFruit());
        appleBox3.addFruit(new AppleFruit());
        appleBox1.transferFruits(appleBox3);
        System.out.println("Вес коробки с яблоками1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками3 после пересыпания: " + appleBox3.getWeight());
    }
}
    

