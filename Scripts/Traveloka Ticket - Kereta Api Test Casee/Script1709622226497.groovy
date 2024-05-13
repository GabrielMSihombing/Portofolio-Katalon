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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.traveloka.com/id-id/kereta-api')

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Select Location'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Select Location'), 'Bandung')

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Detail Location'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Destination Location'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Destination Location'), 'Jakarta')

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Detail Destination'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Date Depart'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Detail Date Depart'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/People'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Detail People'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Search Ticket'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Select Train/Select Train button'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Name'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Name'), 'Gabriel')

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Phone'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Phone'), '8123456789')

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Email'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Email'), 'example@gmail.com')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 1/Title Traveler 1'), 'MR', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 1/Name Traveler 1'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 1/Name Traveler 1'), 'Gabriel')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 1/Tanda Pengenal Traveler 1'), 'KTP', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 1/Select Pengenal Traveler 1'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 1/Select Pengenal Traveler 1'), '3273123456789101')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 2/Title Traveler 2'), 'MR', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 2/Name Traveler 2'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 2/Name Traveler 2'), 'Budi')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 2/Tanda Pengenal Traveler 2'), 'KTP', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 2/Select Pengenal Traveler 2'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 2/Select Pengenal Traveler 2'), '3273123456789102')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 3/Title Traveler 3'), 'MR', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 3/Name Traveler 3'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 3/Name Traveler 3'), 'Asep')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 3/Tanda Pengenal Traveler 3'), 'KTP', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 3/Select Pengenal Traveler 3'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 3/Select Pengenal Traveler 3'), '3273123456789122')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 4/Title Traveler 4'), 'MR', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 4/Name Traveler 4'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 4/Name Traveler 4'), 'Udin')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Kereta Api Test Case/Booking/Traveler 4/Tanda Pengenal Traveler 4'), 'KTP', false)

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Traveler 4/Select Pengenal Traveler 4'))

WebUI.delay(5)

WebUI.setText(findTestObject('Kereta Api Test Case/Booking/Traveler 4/Select Pengenal Traveler 4'), '3273123456789123')

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Next Button Booking'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Next to Payment'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Next Validation Payment Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Next to payment button'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Payment Button'))

WebUI.delay(5)

WebUI.click(findTestObject('Kereta Api Test Case/Booking/Confirmation Payment'))

WebUI.closeBrowser()

