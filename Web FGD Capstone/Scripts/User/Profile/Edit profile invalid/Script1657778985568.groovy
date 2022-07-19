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

WebUI.callTestCase(findTestCase('User/Authentication/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User/Profile/btnProfile'))

WebUI.click(findTestObject('User/Profile/btnEditProfile'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('User/Profile/namaDepanField'), 'Elfrida')

WebUI.setText(findTestObject('User/Profile/namaBelakangField'), 'Tampubolon')

WebUI.setText(findTestObject('User/Profile/handphoneField'), '81370362057')

WebUI.setText(findTestObject('User/Profile/emailField'), 'elfridatampubolon21@gmail.com')

WebUI.setText(findTestObject('User/Profile/dobField'), '05-02-2001', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User/Profile/educationField'))

WebUI.click(findTestObject('User/Profile/SMAChoice'))

WebUI.setText(findTestObject('User/Profile/negaraField'), 'Indonesia')

WebUI.setText(findTestObject('User/Profile/kotaField'), 'Medan')

WebUI.setText(findTestObject('User/Profile/kodePosField'), '22318')

