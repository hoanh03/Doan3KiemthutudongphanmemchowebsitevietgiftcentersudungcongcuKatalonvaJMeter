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

WebUI.click(findTestObject('TCDangKy/nutdangky'))

WebUI.setText(findTestObject('TCDangKy/inputHoten'), inputHoten)

WebUI.setText(findTestObject('TCDangKy/inputemail'), inputemail)

WebUI.setText(findTestObject('TCDangKy/inputMatkhau'), inputMatkhau)

WebUI.click(findTestObject('TCDangKy/buttondangky'))
//nhập sai thì hiển thị thông báo hoten so sánh với kết quả 
if (WebUI.verifyElementPresent(findTestObject('TCDangKy/inputHoten'), 10, FailureHandling.OPTIONAL)) {
    String ketqua = WebUI.getAttribute(findTestObject('TCDangKy/inputHoten'), 'validationMessage')
// so sánh kết quả khác rỗng
    if ((ketqua != null) && (ketqua != '')) {
        WebUI.verifyEqual(ketqua, ketqua)
    }
} else {//lấy thông báo inputemail so sánh voi ketqua
    ketqua = WebUI.getAttribute(findTestObject('TCDangKy/inputemail'), 'validationMessage')

    if ((ketqua != null) && (ketqua != '')) {
        WebUI.verifyEqual(ketqua, ketqua)
    } else {
        ketqua = WebUI.getAttribute(findTestObject('TCDangKy/inputMatkhau'), 'validationMessage')

        if ((ketqua != null) && (ketqua != '')) {
            WebUI.verifyEqual(ketqua, ketqua)
        } else {
            if(WebUI.verifyElementPresent(findTestObject('TCDangKy/tbdunghoangoanh'), 10, FailureHandling.OPTIONAL)) {
				WebUI.verifyElementText(findTestObject('TCDangKy/tbdunghoangoanh'), ketqua)
			}else {
				WebUI.verifyElementText(findTestObject('TCDangKy/'), ketqua)
			}
        }
    }
}

WebUI.closeBrowser()

