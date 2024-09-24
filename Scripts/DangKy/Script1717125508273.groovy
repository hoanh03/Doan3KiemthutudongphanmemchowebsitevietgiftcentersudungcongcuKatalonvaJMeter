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

WebUI.navigateToUrl('https://vietgiftcenter.com/account/register')

WebUI.setText(findTestObject('Object Repository/DangKy/Page_ng k ti khon Craft  More Vietnam  viet_a374b3/input_H_lastName'), 
    inputho)

WebUI.setText(findTestObject('Object Repository/DangKy/Page_ng k ti khon Craft  More Vietnam  viet_a374b3/input_Tn_firstName'), 
    inputten)

WebUI.setText(findTestObject('Object Repository/DangKy/Page_ng k ti khon Craft  More Vietnam  viet_a374b3/input_Email_email'), 
    inputemail)

WebUI.setText(findTestObject('Object Repository/DangKy/Page_ng k ti khon Craft  More Vietnam  viet_a374b3/input_Mt khu_password'), 
    inputmatkhau)

WebUI.click(findTestObject('Object Repository/DangKy/Page_ng k ti khon Craft  More Vietnam  viet_a374b3/button_ng k'))

WebUI.verifyElementText(findTestObject('Object Repository/DangKy/Page_Shop qu tng handmade,  decor trang tr _b5af09/h2_THIP CHC MNG HANDMADE VINTAGE'), 
    'THIỆP CHÚC MỪNG HANDMADE VINTAGE')

WebUI.closeBrowser()

