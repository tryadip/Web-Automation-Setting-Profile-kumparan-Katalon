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

String username = GlobalVariable.username
String pass = GlobalVariable.pass

WebUI.openBrowser("kumparan.com")
WebUI.click(findTestObject("Button/btn_Tidak"))
WebUI.click(findTestObject("Button/btn_Masuk"))
WebUI.setText(findTestObject("TxtField/field_Email"),username)
WebUI.setText(findTestObject("TxtField/field_Pass"),pass)
WebUI.click(findTestObject("Button/btn_Masuk_Dashboard"))
WebUI.click(findTestObject("Button/btn_Profile"))
WebUI.click(findTestObject("Button/btn_Halaman_Profile"))
WebUI.scrollToElement(findTestObject("Button/btn_Komentar"), 0)
WebUI.click(findTestObject("Button/btn_Komentar"))
WebUI.click(findTestObject("Button/btn_Konten"))