import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://app.cloudfinder.com/#/login')

WebUI.setText(findTestObject('Page_Cloudfinder  Login/input_j_username'), 'AT@august19.onmicrosoft.com')

WebUI.setText(findTestObject('Page_Cloudfinder  Login/input_j_password'), 'Afore-2245995')

WebUI.click(findTestObject('Page_Cloudfinder  Login/input_btn btn-default'))

WebUI.setText(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/input_q (1)'), 'sam')

WebUI.sendKeys(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/input_q (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/strong_Sam Yosemite_1 (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/dl_Name            Sam Yosemit (1) (1)'))

WebUI.verifyTextPresent(variable1, true)

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/button_2018-08-23 123124 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/a_2018-08-22 114609 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/button_Restore'))

WebUI.setText(findTestObject('Object Repository/Page_Cloudfinder  Search/input_s2id_autogen8_search'), 'AT')

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/div_ATaugust19.onmicrosoft.com'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/button_Restore'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Search/a_ Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/a_Restore'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/div_Date'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/a_Reports'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Status Reports/a_Restore'))

