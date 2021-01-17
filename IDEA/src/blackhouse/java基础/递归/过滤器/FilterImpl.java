package blackhouse.java基础.递归.过滤器;

import java.io.File;
import java.io.FileFilter;

public class FilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.getName().toLowerCase().endsWith(".java")) {
            return true;
        } else if (pathname.isDirectory()) {
            return true;
        }
        return false;
    }
}
