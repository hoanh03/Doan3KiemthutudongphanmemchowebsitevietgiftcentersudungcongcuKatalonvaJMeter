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

WebUI.openBrowser('https://vietgiftcenter.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('CDN/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/nutdangnhap'))

WebUI.setText(findTestObject('CDN/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/input_Email_email'), 
    'hoangoanh14@gmail.com')

WebUI.setText(findTestObject('CDN/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/input_Mt khu_password'), 
    'oanh14')

WebUI.click(findTestObject('CDN/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/input_Mt khu_btn btn-primary btn-full'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('CDN/Page_Trang khch hng Craft  More Vietnam  vietgiftcenter.com/strong_Xin cho, Hoang Oanh'), 
    'Xin chào, Hoang Oanh !')

WebUI.closeBrowser()

