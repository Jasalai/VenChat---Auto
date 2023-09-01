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

Mobile.tap(findTestObject('Registrar/iniciar registro'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 1 - Ingresa tu numero/seleccionar pais'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 1 - Ingresa tu numero/buscar pais'), 0)

Mobile.sendKeys(findTestObject('Registrar/Formulario 1 - Ingresa tu numero/buscar pais'), 'República Dominicana')

Mobile.tap(findTestObject('Registrar/Formulario 1 - Ingresa tu numero/Republica Dominicana'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 2'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 4'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 5'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 6'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 7'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 8'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 9'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 0'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 1 - Ingresa tu numero/continuar y recibir otp'), 0)

Mobile.verifyElementVisible(findTestObject('Registrar/Formulario 2 - Validar OTP/ventana de validacion'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/dial pad 3'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 2 - Validar OTP/validar otp'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/ingresar nombre'), 0)

Mobile.sendKeys(findTestObject('Registrar/Formulario 3 - Nombre y foto/ingresar nombre'), 'Nuevo Usuario')

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/ingresar descripcion'), 0)

Mobile.sendKeys(findTestObject('Registrar/Formulario 3 - Nombre y foto/ingresar descripcion'), 'Placeholder')

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/aceptar terminos'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/agregar foto de perfil'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/agregar desde la camara'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Chats P2P/Chat P2P/Adjuntar/foto/tomar foto'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/aceptar foto'), 0)

Mobile.tap(findTestObject('Registrar/Formulario 3 - Nombre y foto/completar registro'), 0)

Mobile.verifyElementVisible(findTestObject('Registrar/Formulario 3 - Nombre y foto/mensaje de exito'), 0)

