package testWordpress;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_post {
	@BeforeClass
	public void NavigateToPostPage() {
		System.out.println("");
		System.out.println("Click on post page of wordpress-------------");
		System.out.println("");
	}

	@AfterClass
	public void writeStatusToExcel() {
		System.out.println("");
		System.out.println("Write Pass/Fail/Skip status to Excel / HTML report");
	}

	@BeforeMethod
	public void VerifyExecutionStatus() {
		System.out.println("");
		System.out.println("Verify testcase execution status from excel");

	}

	@AfterMethod
	public void WriteStatusToExcel() {

		System.out.println("Write Testcase Pass/Fail/Skip status to Excel / HTML report ");
		System.out.println("");
	}

	@Test
	public void AddNewPost() {
		System.out.println(" Testing Add New post");
	}

	@Test(dependsOnMethods = { "AddNewPost" })
	public void EditPost() {
		System.out.println("Edit post Testing");
	}

	@Test(dependsOnMethods = { "EditPost" })
	public void ViewPost() {
		System.out.println("View post testing");
	}

	@Test(dependsOnMethods = { "ViewPost" })
	public void QuickEditPost() {
		System.out.println("Quick Edit post testing");
	}

	@Test(dependsOnMethods = { "QuickEditPost" })
	public void TrashPost() {
		System.out.println("Trash post testing");
	}
}
