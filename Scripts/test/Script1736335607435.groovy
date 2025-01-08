import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-ics.imedx.com.au/')

WebUI.setText(findTestObject('Object Repository/demo/Page_IMedX-Admin/input_Username_username'), 'Sai')

WebUI.setEncryptedText(findTestObject('Object Repository/demo/Page_IMedX-Admin/input_Password_password'), 'CM0bM3+3TuUZBrXTbHKFEQ==')

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/button_Log In'))

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/a_Discovery Companion'))

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/a_Workflow Companion'))

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/a_AI Companion'))

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/a_Discover Features'))

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/path'))

WebUI.click(findTestObject('Object Repository/demo/Page_IMedX-Admin/span_Logout'))

WebUI.closeBrowser()

