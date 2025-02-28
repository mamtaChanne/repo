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

WebUI.callTestCase(findTestCase('Orange hrm verify header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamtabele-trials715.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'), 'Rh9ePu8J8PE=')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img_Login_icon show-icon'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'), 'N4wH1gbh6xA=')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Login_txtPassword'), '8tjxhkGuP+cB73upl0w6BQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Employee Management/div_Admin'), 'Admin')

