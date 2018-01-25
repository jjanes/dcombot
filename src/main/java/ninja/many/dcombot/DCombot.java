package ninja.many.dcombot;

import com.eclipsesource.v8.*;
import ninja.many.dcombot.Bot;
import ninja.many.dcombot.system.Config;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class DCombot {
    public static void main(String args[]) {
        V8 runtime = V8.createV8Runtime();
        /*
        runtime.executeVoidScript(""
                + "var person = {};\n"
                + "var hockeyTeam = {name : 'WolfPack'};\n"
                + "person.first = 'Ian';\n"
                + "person['last'] = 'Bull';\n"
                + "person.hockeyTeam = hockeyTeam;\n"
        );

        V8Object person = runtime.getObject("person");
        V8Object hockeyTeam = person.getObject("hockeyTeam");
        System.out.println(hockeyTeam.getString("name"));
        person.release();
        hockeyTeam.release();
        */

        System.out.println(System.getProperty( "os.name" ) );
        String path = System.getProperty("user.dir")+"/config/config.js";
        System.out.println(path);

        File script = new File(path);

        System.out.println(System.getProperty("user.dir"));
        try {
            runtime.executeScript(FileUtils.readFileToString(script));

            V8Array bots =  runtime.getArray("DCombot");

            for (Integer i = 0;bots.length() > i;i++) {
                V8Object bot = bots.getObject(i);
                System.out.println(bot.getString("title"));
            }

            System.out.println(runtime.getType("DCombot"));

            bots.release();
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
        // TODO: Access the person object
        runtime.release();
    }
}
