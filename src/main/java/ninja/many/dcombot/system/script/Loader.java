package ninja.many.dcombot.system.script;

import org.apache.commons.io.FileUtils;
import java.io.File;

public class Loader {
    private String content;
    private Boolean exist;

    public Loader(String file)
    {
        File script = new File(file);
        exist = false;

        if(script.exists() && !script.isDirectory()) {
            try {
                content = FileUtils.readFileToString(script);
                exist = true;
            } catch (java.io.IOException e) {
            }
        }
    }

    public boolean exist()
    {
        return exist;
    }

    public String getContent()
    {
        return content;
    }
}
