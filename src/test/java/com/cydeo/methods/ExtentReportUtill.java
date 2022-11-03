package com.cydeo.methods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class ExtentReportUtill {
    public static ExtentReports extent;

    public static void ExtentReport() {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("Test report for Cucumba");
        spark.config().setEncoding("utf-8");
        spark.config().setReportName("Test report");
        extent.attachReporter(spark);
    }

    public static void FlushReport() {
        extent.flush();
    }

    public static void ExtentReportScreenshot(Scenario scenario) {
        var scr = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(scr, "image/png", scenario.getName());
    }

}
