package bid.woou.common.tools;

import java.util.Optional;

/**
 * Created by cc on 2018/1/6.
 */
public class OptionalUtil {
    public static boolean isEmpty(String str) {
        return Optional.ofNullable(str).isPresent();
    }

    public static boolean isEmpty(Long num) {
        return Optional.ofNullable(num).isPresent();
    }

    public static boolean isEmpty(Integer num) {
        return Optional.ofNullable(num).isPresent();
    }

    public static boolean isEmpty(Object object) {
        return Optional.ofNullable(object).isPresent();
    }

    public static Object get(Object object) {
        return Optional.ofNullable(object).isPresent() != false ? Optional.ofNullable(object).get() : null;
    }

}
