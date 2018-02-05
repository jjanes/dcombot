package ninja.many.dcombot;

import com.eclipsesource.v8.*;
import ninja.many.dcombot.Bot;
import ninja.many.dcombot.system.Config;
import org.apache.commons.io.FileUtils;
import java.io.File;
import ninja.many.dcombot.system.Config;

public class DCombot {
  V8 runtime;
  
  public static void main(String args[]) {

        Config cfg = new Config();

        System.out.println("!!!");

       /*
        runtime = V8.createV8Runtime();
     
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
      

        System.out.println(System.getProperty( "os.name" ) );
        String path = System.getProperty("user.dir")+"/config/config.js";
        System.out.println(path);

        File script = new File(path);

        System.out.println(System.getProperty("user.dir"));
      
        try {
            runtime.executeScript(FileUtils.readFileToString(script));

   
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
        // TODO: Access the person object
        runtime.release();
        */
    }
  
    public V8 getRunetime() {
      return runtime;
    }

    public void release() 
    {
      runtime.release();

    }
}
