package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        //report almak için plugin ekliyoruz
       //plugin = "html:target\\default-cucumber-reports",
        plugin = {
                "html:target\\default-cucumber-reports",
                "json:target\\json-reports\\cucumber.json",
                "junit:target\\xml-report\\cucumber.xml"
        },
        //Yukardakiler plugin e eklenebilir json ve junit raporları almak için
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",//features a ulaşmak için lazım
        //Path of the step definitions folder
        glue = "stepdefinitions",//Stepdefinitionsa ulaşmak için lazım
        tags = "@smoke4",
        dryRun = false
)
public class Runner {
    //Runner class is to RUN thr feature files
    //This runner class is also used to configure and control the framework
}
