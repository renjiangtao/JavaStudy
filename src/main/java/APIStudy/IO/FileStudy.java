package APIStudy.IO;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileStudy {

    @Test
    public void pathSeparator(){
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);  //路径分隔符   windows ; 分号    linux :
    }

    @Test
    public void getPath() throws IOException {
        File file = new File("D:\\JavaProject\\JavaStudy\\src\\main\\resources\\file\\a.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        String canonicalPath = file.getCanonicalPath();
        System.out.println("canonicalPath = " + canonicalPath);

        String path = file.getPath();
        System.out.println("path = " + path);

        String name = file.getName();
        System.out.println("name = " + name);



        File file2 = new File("D:\\JavaProject\\JavaStudy\\src\\main");
        String[] list = file2.list();
        System.out.println("list = " + Arrays.toString(list));

        System.out.println("file2.isDirectory() = " + file2.isDirectory());
        System.out.println("file2.isFile() = " + file2.isFile());

    }
}
