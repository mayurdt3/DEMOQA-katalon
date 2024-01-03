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

WebUI.openBrowser('https://www.globalsqa.com/demo-site/dialog-boxes/')

WebUI.click(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/button_Create new user'))

WebUI.click(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/div_ui-resizable-handle ui-resizable-w'))

WebUI.setText(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/input_name'), 'mayur')

WebUI.setText(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/input_email'), 'jane@smith.com')

WebUI.click(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/input_email'))

WebUI.click(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/div_All form fields are required.NameEmailPassword'))

WebUI.setText(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/input_email'), 'mayur@smith.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/input_password'), 
    'KL8Y/UuprLI=')

WebUI.click(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/div_All form fields are required.NameEmailPassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/input_password'), 
    'k5kHgOqwBUM=')

WebUI.click(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/button_Create an account'))

WebUI.verifyElementText(findTestObject('Object Repository/Dialogbox/WebBase/Page_Dialog Boxes - GlobalSQA/td_mayur'), 'mayur')

WebUI.closeBrowser()

