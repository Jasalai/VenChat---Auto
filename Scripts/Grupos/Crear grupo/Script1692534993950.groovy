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

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject


Mobile.startExistingApplication('com.cybercapitalparnerscorp.venchat.develop')

Mobile.tap(findTestObject('Main Principal/ir a grupos'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/abrir menu de 3 puntos'), 0)

Mobile.tap(findTestObject('Main Principal/Menu de 3 puntos/abrir contactos'), 0)

Mobile.tap(findTestObject('Main Principal/Menu de 3 puntos/Contactos/crear nuevo grupo'), 0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 1 - Seleccionar contactos/boton lupa'), 
    0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 1 - Seleccionar contactos/buscar'), 
    0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 1 - Seleccionar contactos/buscar'), 
    'Jose')

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

driver.find_element(AppiumBy.XPATH, '//android.widget.ImageView[contains(@content-desc, "+584249559408")]').click()

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 1 - Seleccionar contactos/aceptar contactos'), 
    0)

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 2 - Nombre del grupo/nombre del grupo'), 
    0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 2 - Nombre del grupo/nombre del grupo'), 
    'SmokeTest Gupo')

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 2 - Nombre del grupo/descripcion'), 
    0)

Mobile.sendKeys(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 2 - Nombre del grupo/descripcion'), 
    'Ninguna en especifico')

Mobile.tap(findTestObject('Main Principal/Main Menu - Grupos/Formulario Crear grupo/Parte 2 - Nombre del grupo/finalizar creacion'), 
    0)

