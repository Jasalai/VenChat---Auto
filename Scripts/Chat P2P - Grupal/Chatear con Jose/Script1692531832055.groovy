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
// desde aqui fueron agregados por el tester
import com.kms.katalon.core.testobject.ConditionType as ConditionType

Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop')

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/nuevo mensaje'), 0)

Mobile.tap(findTestObject('Main Principal/Menu de 3 puntos/Contactos/buscar'), 0)

Mobile.tap(findTestObject('Main Principal/Menu de 3 puntos/Contactos/barra de busqueda'), 0)

Mobile.sendKeys(findTestObject('Main Principal/Menu de 3 puntos/Contactos/barra de busqueda'), 'Jose')

TestObject Jose = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//android.widget.ImageView[contains(@content-desc, "+584249559408")]')
Mobile.tap(Jose,0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 'Hola Jose como estas???')

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/boton enviar'), 0)

