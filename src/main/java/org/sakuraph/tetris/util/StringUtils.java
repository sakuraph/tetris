package org.sakuraph.tetris.util;

/**
 * @author sakuraph@sina.cn
 */
public abstract class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
