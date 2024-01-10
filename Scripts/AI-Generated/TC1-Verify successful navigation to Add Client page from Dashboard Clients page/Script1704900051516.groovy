import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page dashboard clients addClient'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dashboard/clients/addClient')

'step 2: At Page dashboard clients addClient click on span object --> navigate to Page login'

testObj = findTestObject('AI-Generated/Page_dashboard_clients_addClient/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dashboard/clients/addClient/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Navigate to Page login --> navigate to Page dashboard clients editClientb-be64-4b13-8e33-'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/login')

'step 4: At Page dashboard clients editClientb-be64-4b13-8e33- click on button object --> navigate to Page login'

testObj = findTestObject('AI-Generated/Page_dashboard_clients_editClient/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dashboard/clients/editClient/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Navigate to Page login'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/login')

'step 6: Add visual checkpoint at Page login'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify successful navigation to Add Client page from Dashboard Clients page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
