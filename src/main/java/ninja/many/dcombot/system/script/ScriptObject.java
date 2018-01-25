package ninja.many.dcombot.system.script;

import com.eclipsesource.v8.*;

public class ScriptObject {
    String content;
    Boolean hasContent;


    public ScriptObject(String file)
    {
        Loader script = new Loader(file);

        if (script.exist()) {
            hasContent = true;
            content = script.getContent();
        } else {
            hasContent = false;
        }
    }

    public boolean hasContent()
    {
      return hasContent;
    }

    public boolean load()
    {

        return true;
    }

    public boolean exec()
    {
        if (hasContent) {
            V8 runtime = V8.createV8Runtime();

            runtime.executeScript(content);

            V8Array bots =  runtime.getArray("DCombot");

            for (Integer i = 0;bots.length() > i;i++) {
                V8Object bot = bots.getObject(i);
                System.out.println(bot.getString("test"));
            }

            System.out.println(runtime.getType("DCombot"));

            bots.release();

        }

        return true;
    }

    public void release()
    {

    }
}
