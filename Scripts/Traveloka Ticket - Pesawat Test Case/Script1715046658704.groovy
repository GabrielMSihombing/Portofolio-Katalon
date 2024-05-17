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

WebUI.navigateToUrl('https://www.traveloka.com/id-id/tiket-pesawat')

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/From'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Pesawat Test Case/Booking/From'))

WebUI.clearText(findTestObject('Pesawat Test Case/Booking/From'))

WebUI.setText(findTestObject('Pesawat Test Case/Booking/From'), 'Bandung')

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/Select From'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/To Be'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Pesawat Test Case/Booking/To Be'))

WebUI.clearText(findTestObject('Pesawat Test Case/Booking/To Be'))

WebUI.setText(findTestObject('Pesawat Test Case/Booking/To Be'), 'Medan')

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/Select To Be'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/Departure Of Date'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/Select Departure of Date'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Booking/Search Ticket Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Select Penerbangan'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Next Booking Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Personal Data/First Name'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pesawat Test Case/Personal Data/First Name'), 'Untung')

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Personal Data/Last Name'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pesawat Test Case/Personal Data/Last Name'), 'Budianto')

WebUI.delay(1)

WebUI.click(findTestObject('Pesawat Test Case/Personal Data/Phone Number'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pesawat Test Case/Personal Data/Phone Number'), '8123456789')

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Personal Data/Email'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pesawat Test Case/Personal Data/Email'), 'example@gmail.com')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Pesawat Test Case/Personal Data/Title Traveler'), 'MR', false)

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Personal Data/First Name Traveler'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pesawat Test Case/Personal Data/First Name Traveler'), 'Rugi')

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Personal Data/Last Name Traveler'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pesawat Test Case/Personal Data/Last Name Traveler'), 'Sugianto')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Pesawat Test Case/Personal Data/Citizen'), 'ID', false)

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Next to Payment Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Next Payment 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Pesawat Test Case/Confirmation Payment 1'))

WebUI.delay(10)

WebUI.click(findTestObject('Pesawat Test Case/Payment Button'))

