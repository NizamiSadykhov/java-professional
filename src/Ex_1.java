public class Ex_1 {
    public static <T> void changeElementsInArray(T[] array,int indexOne, int indexTwo) {
        T tmp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = tmp;
    }
}
