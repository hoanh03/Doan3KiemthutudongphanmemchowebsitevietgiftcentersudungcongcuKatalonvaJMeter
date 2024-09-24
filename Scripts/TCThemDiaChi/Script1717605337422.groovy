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

WebUI.callTestCase(findTestCase('CDN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'HY')

WebUI.setText(findTestObject('null'), 
    'Vinh')

WebUI.setText(findTestObject('null'), 
    'Vinh')

WebUI.setText(findTestObject('null'), 'VietNam')

WebUI.setText(findTestObject('ThemDiaChi/input__PhoneNumber'), '0862026988')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('ThemDiaChi/tbthemthanhcong'), 'Tên tài khoản: Hoang Oanh')

// Click vào ô textbox để mở dropdown
WebUI.click(findTestObject('Path/To/Textbox'))

// Chờ cho dropdown xuất hiện (có thể cần thiết)
WebUI.waitForElementVisible(findTestObject('Path/To/Dropdown/Item/Vietnam'), 10)

// Click vào item của dropdown
WebUI.click(findTestObject('Path/To/Dropdown/Item/Vietnam'))

