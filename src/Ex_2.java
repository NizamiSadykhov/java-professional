import java.util.ArrayList;

public class Ex_2 {
    public static <T> ArrayList<T> getArrayListFormArray(T[] array){
        ArrayList<T> result = new ArrayList<>();
        for(T element: array) {
            result.add(element);
        }
        return result;
    }
}
