package ninja.many.dcombot.system;

import com.eclipsesource.v8.*;
import ninja.many.dcombot.system.script.ScriptObject;

public class Config {
    ScriptObject config;

    public Config() {
        System.out.println("ADASDASDADS"); 
        String file = System.getProperty("user.dir")+"/config/config.js";

        config = new ScriptObject(file);

        config.exec();
        
        V8 runtime = config.getRuntime();
      



        V8Array bots =  runtime.getArray("DCombot");

        for (Integer i = 0;bots.length() > i;i++) {
          V8Object bot = bots.getObject(i);
          System.out.println(bot.getString("title"));
        }

        System.out.println(runtime.getType("DCombot"));

        bots.release();



    }
}
