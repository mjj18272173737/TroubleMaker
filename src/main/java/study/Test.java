package study;

import java.lang.reflect.Field;

/** 2 + 2 = 5
 * Created by CPR199 on 2016-12-05.
 */
public class Test {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3

        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
