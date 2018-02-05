package ninja.many.dcombot.system.script;

import com.eclipsesource.v8.*;

public class ScriptObject {
    String content;
    Boolean hasContent;
    Boolean hasExecuted;
    V8 runtime;


    public ScriptObject(String file)
    {
        hasExecuted = false;

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
            runtime = V8.createV8Runtime();

            // try {
              // runtime.executeScript(FileUtils.readFileToString(script));
              runtime.executeScript(content);


            // } catch (java.io.IOException e) {
            //  System.err.println(e.getMessage());
            // }


        }

        return true;
    }

    public V8 getRuntime()
    {
      return runtime;
    }
    
    public void release()
    {
      runtime.release();
    }
}
