package ninja.many.dcombot;

import com.eclipsesource.v8.*;

public class DCombot {
    public static void main(String args[]) {
        V8 runtime = V8.createV8Runtime();
        runtime.executeVoidScript(""
                + "var person = {};\n"
                + "var hockeyTeam = {name : 'WolfPack'};\n"
                + "person.first = 'Ian';\n"
                + "person['last'] = 'Bull';\n"
                + "person.hockeyTeam = hockeyTeam;\n");
        // TODO: Access the person object
        runtime.release();
    }
}
