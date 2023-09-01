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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.testobject.ConditionType

Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop', FailureHandling.STOP_ON_FAILURE)
/*
// enviar docx
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/abrir adjuntar'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/adjuntar documentos'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/buscar archivos'), 0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/buscar archivo'), 'ven.docx')

Mobile.pressBack()

try {
    Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/seleccionar primer archivo'), 0)
}
catch (Exception e) {
    Mobile.pressBack()
} 
*/
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

//sleep(10000)

//driver.findElement(By.xpath("//*[contains(@accessibility_id,'ven.docx')]"))

//driver.findElementsByAccessibilityId("@contains('ven.docx')")

TestObject saveButton = new TestObject().addProperty('accessibilityId', ConditionType.EQUALS, 'Contactos')
Mobile.tap(saveButton, 0)


//className = 'android.widget.ImageView'
//driver.find_element_by_xpath("//*[@class='"+className+"' and @accesibilityID='"+accessibilityID +"']")


