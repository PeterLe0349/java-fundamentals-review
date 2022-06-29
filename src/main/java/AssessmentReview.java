import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AssessmentReview {
    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats){
        ArrayList<Cat> cats2 = new ArrayList<>();
        for(Cat cat: cats){
            cats2.add(new Cat(cat.getAge(), cat.isRescue, cat.getName(),cat.getColor().toUpperCase()));
        }
        return cats2;
    }

    public static void main(String[] args) {
//        System.out.println(cubed(3));
//        System.out.println(difference(2,4));
//        System.out.println(difference(2.123,4.123234));
//        int[] array = {7, 6, 5, 4, 3, 1, 2, 8};
//        System.out.println(median(array));


//        On your AssessmentReview class create a static method named uppercaseCatColor.
//
//                This method should:
//
//        Receive an ArrayList of Cat objects as a parameter.
//                The method should return an ArrayList of Cat objects, where each Cat object's color field is in uppercase.
//        Sample Input
//        Pet p = new Pet(23, true, "Fido");
//        System.out.println(p.getAge());
//        ArrayList<Cat> cats = new ArrayList<>();
//        Cat cat = new Cat(23, true, "Felix", "red");
//        Cat cat2 = new Cat(23, true, "Felix", "orange");
//        Cat cat3 = new Cat(23, true, "Felix", "white");
//        cats.add(cat);
//        cats.add(cat2);
//        cats.add(cat3);
//        for(Cat c: cats){
//            System.out.println(c.getColor());
//        }
//        ArrayList<Cat> catz = uppercaseCatColor(cats);
//        for(Cat c: catz){
//            System.out.println(c.getColor());
//        }
//
////        cat.meow();
//        Dog dog = new Dog(21, true, "Filo", "Poodle");
//        dog.bark();

    }








//    Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
//    Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading). Both variations of the method should return the result of subtracting the second argument from the first argument.
//    Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
//            (Hint: there are examples of how to find median of an array in Java all over the internet)
//            (Hint: the sort method on the Arrays class may be very helpful here)
//            (Hint: make sure the median of [1, 3, 4, 2, 6, 5, 8, 7] is 4.5)
    public static double median(int[] nums){
        Arrays.sort(nums);
        if(nums.length%2 == 0){
            double  dif = nums[nums.length/2] + nums[(nums.length/2) -1];
            return dif/2;
        }else
            return (double)nums[nums.length/2];
    }

    public static int difference(int a, int b){
        return a-b;
    }

    public static double difference(double a, double b){
        return a-b;
    }

    public static int cubed(int n){
        return n*n*n;
    }















} //end of class
