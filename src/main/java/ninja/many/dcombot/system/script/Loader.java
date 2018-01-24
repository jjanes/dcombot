package ninja.many.dcombot.system.script;

import org.apache.commons.io.FileUtils;
import java.io.File;

public class Loader {
    private String Content;

    public boolean Loader(String file)
    {
        File script = new File(file);
        if(script.exists() && !script.isDirectory()) {
            try {
                Content = FileUtils.readFileToString(script);
                return true;
            } catch (java.io.IOException e) {
                return false;
            }
        } else {
            return false;
        }
    }
    public String getContent()
    {
        return Content;
    }
}
