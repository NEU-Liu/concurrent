package MyUnsafe;

import sun.misc.FileURLMapper;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class MyUnsafe {

    public static Unsafe getUnsafeInstance() {

        Field field = null;

        try {
            field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            System.out.println("不可能发生异常!");
        }
        return null;

    }

}
