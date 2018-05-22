package saveAnnotations;

import java.io.FileWriter;
import java.io.IOException;

public class Container {
@SaveTo(path = "d:\\1.txt")
    String s = "Hello, Java!";
        @Saver
        public void save(String path) {

            try(FileWriter fw = new FileWriter(path)) {
                fw.write(s);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

}
