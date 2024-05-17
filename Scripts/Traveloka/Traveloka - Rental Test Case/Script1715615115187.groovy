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

WebUI.navigateToUrl('https://www.traveloka.com/id-id/car-rental')

WebUI.click(findTestObject('Rental Test Case/Location/Location'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Location/Location'), 'Jakarta')

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Location/Select Location'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Pick-up/Pick-up Date'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Pick-up/Select Pick-up Date'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Pick-up/Time Pick-up'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Pick-up/Hour Pick-up'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Pick-up/Minute Pick-up'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Pick-up/Select Time Pick-up'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Drop-off/Drop-off Date'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Drop-off/Select Drop-off Date'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Drop-off/Time Drop-off'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Drop-off/Hour Drop-off'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Drop-off/Minute Drop-off'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Drop-off/Select Time Drop-off'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Search Car/Search Car'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Select Car'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Select Car Provider'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Pick-up Location Folder/Pick-up Location'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Pick-up Location Folder/Pick-up Location Dropdown'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Pick-up Location Folder/Pick-up Location Detail'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Drop-off Location Folder/Drop-off Location'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Drop-off Location Folder/Drop-off Detail'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Select Car/Drop-off Location Folder/Drop-off Detail'), 'Gambir')

WebUI.delay(10)

WebUI.click(findTestObject('Rental Test Case/Select Car/Drop-off Location Folder/Select Drop-off detail'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Book Now'))

WebUI.delay(10)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Fill Contact Name'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Select Car/Book Now Folder/Fill Contact Name'), 'Gabriel')

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Fill Contact Phone'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Select Car/Book Now Folder/Fill Contact Phone'), '08123456789')

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Fill Contact Email'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Select Car/Book Now Folder/Fill Contact Email'), 'admin@gmail.com')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Rental Test Case/Select Car/Book Now Folder/Driver Details Folder/Driver Title'), 'MR', 
    false)

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Driver Details Folder/Driver Name'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Select Car/Book Now Folder/Driver Details Folder/Driver Name'), 'Gabriel')

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Driver Details Folder/Driver Phone'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental Test Case/Select Car/Book Now Folder/Driver Details Folder/Driver Phone'), '08123456789')

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Driver Details Folder/Next booked driver'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Rental Requirements/Open Rental Requirement'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Rental Requirements/Select Rental Requirements'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Rental Requirements/Save Rental Requirements'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Rental Requirements/Next Payment'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental Test Case/Select Car/Book Now Folder/Rental Requirements/Validation Payment'))

WebUI.click(findTestObject('Rental Test Case/Select Car/Payment Method Folder/Select Payment Method'))

WebUI.click(findTestObject('Rental Test Case/Select Car/Payment Method Folder/Pay the Bills'))

