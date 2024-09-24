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

WebUI.click(findTestObject('QuenKM/nutdangnhap'))

WebUI.click(findTestObject('QuenKM/taiday'))

WebUI.setText(findTestObject('QuenKM/inputemail'), inputemail)

WebUI.click(findTestObject('QuenKM/inputgui'))
//kiểm tra thông báo khi nhập đúng email có hiển thị không
if (WebUI.verifyElementPresent(findTestObject('QuenKM/dangnhaptaikhoan'), 10, FailureHandling.OPTIONAL)) {
	//so sánh thông báo trên màn hình có khớp với dự kiến không
    WebUI.verifyElementText(findTestObject('QuenKM/dangnhaptaikhoan'), ketqua)
} else {
	//Nếu nhập sai email thì lấy thông báo
    String ketqua = WebUI.getAttribute(findTestObject('QuenKM/inputemail'), 'validationMessage')
// nếu thông báo khác rỗng
    if ((ketqua != null) && (ketqua != '')) {
        WebUI.verifyEqual(ketqua, ketqua) // so sánh thông báo lấy được trên màn hình có khớp với thông báo dự kiến không
    }
}

WebUI.closeBrowser()

