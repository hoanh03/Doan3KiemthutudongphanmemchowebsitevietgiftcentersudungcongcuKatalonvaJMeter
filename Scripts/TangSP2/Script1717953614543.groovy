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

WebUI.openBrowser('https://vietgiftcenter.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('TangSP2/Page_Trang khch hng Craft  More Vietnam  vietgiftcenter.com/imgtrangchu'))

WebUI.delay(2)

WebUI.click(findTestObject('TangSP2/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/imgsp'))

WebUI.click(findTestObject('TangSP2/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/span_X'))

WebUI.click(findTestObject('TangSP2/Page_Shop qu tng handmade,  decor trang tr c o vintage TpHCM H Ni  Nng Craft  More Vietnam  vietgiftcenter.com/icongh'))

WebUI.verifyTextPresent('1', false)

WebUI.verifyTextPresent('50.000', false)

WebUI.click(findTestObject('TangSP2/Page_Gi hng Craft  More Vietnam  vietgiftcenter.com/button_cong'))

WebUI.verifyTextPresent('2', false)

WebUI.verifyTextPresent('100.000', false)

