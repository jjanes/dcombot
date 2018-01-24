package ninja.many.dcombot.system;

import ninja.many.dcombot.system.script.ScriptObject;

public class Config {
    ScriptObject config;

    public Config() {
        String file = System.getProperty("user.dir")+"/config/config.js";

        config = new ScriptObject(file);






    }
}
