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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import groovy.transform.Synchronized
import io.appium.java_client.MultiTouchAction as MultiTouchAction

Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 'Mensaje seguro')

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/boton enviar'), 0)

// enviar foto
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Tipos de mensaje/boton tipo de mensaje'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Tipos de mensaje/modo confidencial'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Chat Grupal/abrir adjuntar'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Chat Grupal/Adjuntar/adjuntar foto'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Chat Grupal/Adjuntar/documentos/desde la camara'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/foto/tomar foto'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/foto/aceptar edicion foto'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/enviar adjunto'), 0)

// prueba de hilos
'Create First action Object to "TouchAction" class'
TouchAction action1 = new TouchAction(driver)

action1.press(PointOption.point(X1, Y1)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000))).release()
action1

TestObject revelar_foto = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View[1]')


TestObject foto = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.ImageView[1]')

Mobile.tap(foto, 0)

// enviar video
Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/abrir adjuntar'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/adjuntar video'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/desde la galeria'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/buscar archivos'), 0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/buscar archivo'), 'ven.mp4')

Mobile.pressBack()

try {
    Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/documentos/seleccionar primer archivo'), 
        0)
}
catch (Exception e) {
    Mobile.pressBack()
} 

Mobile.
