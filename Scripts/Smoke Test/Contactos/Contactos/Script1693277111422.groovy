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

Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Main Principal/abrir Menu 3 puntos'), 0)

Mobile.tap(findTestObject('Contactos/BtnContactosMenu'), 0)

//Mobile.verifyElementVisible(findTestObject('Contactos/ListaContactos'), 0)
assert Mobile.verifyElementVisible(findTestObject('Contactos/ListaContactos'), 0) == true : 'El listado de contactos no está visible'

Mobile.tap(findTestObject('Main Principal/Menu de 3 puntos/Contactos/crear nuevo grupo'), 0)

Mobile.tap(findTestObject('Contactos/LabelNuevoGrupo'), 0)

if (Mobile.verifyElementVisible(findTestObject('Contactos/LabelSeleccioneContactos'), 0) && Mobile.verifyElementVisible(
    findTestObject('Contactos/LabelSeleccioneContactos'), 0)) {
    assert true : 'Los label estan visibles'
} else {
    assert false : 'Los label NO estan visibles'
}

if (Mobile.verifyElementVisible(findTestObject('Contactos/ListaContactosNuevoGrupo'), 0)) {
    assert true : 'La lista de contactos esta visible'
} else {
    assert false : 'La lista de contactos NO estan visibles'
}

Mobile.pressBack()

Mobile.tap(findTestObject('Contactos/BtnMinumContactos'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/escribir mensaje'), 'Hola probando katalon - smoke test contactos iniciar chat')

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/boton enviar'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Main Principal/abrir Menu 3 puntos'), 0)

Mobile.tap(findTestObject('Contactos/BtnContactosMenu'), 0)

Mobile.tap(findTestObject('Contactos/BtnNuevoContacto'), 0)

if (Mobile.verifyElementVisible(findTestObject('Contactos/Crear Contacto/LabelCrearContacto'), 0)) {
    assert true : 'El  label estan visibles'
} else {
    assert false : 'Los label NO estan visibles'
}

if (Mobile.verifyElementVisible(findTestObject('Contactos/Crear Contacto/BtnGuardarContacto'), 0) && Mobile.verifyElementVisible(findTestObject('Contactos/Crear Contacto/BtnCerrarCrearContacto'), 0) ) {
    assert true : 'Botones cerrar y guardar visibles'
} else {
    assert false : 'Botones cerrar y guardar NO estan visibles'
}

