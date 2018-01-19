package ninja.many.dcombot;

import com.eclipsesource.v8.*;
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

        String path = System.getProperty("user.dir")+"/config/config.js";

        File script = new File(path);

        System.out.println(System.getProperty("user.dir"));
        try {
            runtime.executeScript(FileUtils.readFileToString(script));


        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
        // TODO: Access the person object
        runtime.release();
    }
}
