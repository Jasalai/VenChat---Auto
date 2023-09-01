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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver

Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop')

// enviar mensaje tipo confidencial
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Tipos de mensaje/boton tipo de mensaje'), 0)
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Tipos de mensaje/modo confidencial'), 0)
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/comentar adjunto'), 0)
Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/comentar adjunto'), 'Test - mensaje confidencial')
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/boton enviar'), 0)

/*AppiumDriver<?> driver = MobileDriverFactory.getDriver()
hora_actual = driver.getDeviceTime('h:m a')
hora_actual.replace('p', 'p. ')
hora_actual.replace('a', 'a. ')
hora_actual.replace('m', 'm.')*/

// enviar mensaje tipo borrar
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Tipos de mensaje/boton tipo de mensaje'), 0)
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Tipos de mensaje/modo borrado automatico'), 0)
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/comentar adjunto'), 0)
Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/comentar adjunto'), 'Test - mensaje borrado automatico')
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/boton enviar'), 0)

