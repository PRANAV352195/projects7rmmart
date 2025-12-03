
package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("Demo Project");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Pranav");
		extentReports.setSystemInfo("Name", "Pranav");
		return extentReports;
	}
	//for detailed html report to generate html report
	//in pom file avenstackdependency  extend report and extend spark report it is uded for test outut folder 
	//
	
	
	
	
}
