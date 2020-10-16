/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/16/2020
 * Time: 3:07 PM
 */
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);

        System.out.println(listInteger.get(0));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
        listInteger.get(4);
        System.out.println(listInteger.get(-1));
    }
}
