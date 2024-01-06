import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import junit.test.PasswordComply;

public class PasswordComplyUsingHooksTest {

	
PasswordComply password;
static File myFileReader;
static Scanner myScannerRead;
static InputStream passwordFile;
TestInfo testInfo;
TestReporter testReporter;

@BeforeAll
private static void prepareLoadTestData() {
	try {			
     // Do not forget to change the location of file
        myFileReader = new File("C:\\JUnit\\PasswordFile.txt");
        myScannerRead = new Scanner(myFileReader);   	       
    } catch (IllegalArgumentException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	}		
}

@BeforeEach
void init(TestInfo testInfo, TestReporter testReporter) {
	this.testInfo = testInfo;
	this.testReporter = testReporter;
	testReporter.publishEntry("Running " + testInfo.getDisplayName() + " under tags " + testInfo.getTags());
	password = new PasswordComply("");
}

@AfterEach
void cleanUpAfterTest() {
	myScannerRead.close();
	System.out.println("Clean Up of all local resources...");		
}	

@AfterAll
static void cleanAll() {
		
	Runtime. getRuntime(). gc();
	System.out.println("Clean up of Application Level DB data, Logs, resources etc.. done.");
}

@Nested	
@Tag("Configuration-File-Check")
@DisplayName("Check ALL Config Files")
class COnfigFilesAvailable {
	
	@Test
	@DisplayName("Config")
	void checkALLConfigFiles() {
		System.out.println("All Config files created...");
	}

	@Test
	@DisplayName("Config Entries Created...")
	@RepeatedTest(2)
	void checkALLConfigEntries() {
		System.out.println("All Config entries valid...");
	}
}		

@Test
@Tag("DB-Password-Checks")
@DisplayName("Check ALL DB Password are Valid...")
void testDoesPasswordComply() {
	assumeTrue((myFileReader != null));
	boolean expectedResult = true;	
	while (myScannerRead.hasNextLine()) {
		String passwordRead = myScannerRead.nextLine();
		System.out.println("Password Read from File : " + passwordRead);
    	password.setPassword(passwordRead);
		boolean actualResult = password.doesPasswordComply();
		assertAll(
				() -> assertEquals(expectedResult,actualResult, "Password conditions failed!")
				);
    }
}	


@Disabled
@Test
void cleanUpFiles() {
	myFileReader.delete();
	System.out.println("Deleting all config, password file created.");
}	

}
