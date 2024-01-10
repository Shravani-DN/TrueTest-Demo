import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page dashboard clients clientDetailsb-be64-4b13-8e'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dashboard/clients/clientDetails/1355713b-be64-4b13-8e33-32d3dd8ac690')

'step 2: Add visual checkpoint at Page dashboard clients clientDetailsb-be64-4b13-8e'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify successful navigation to Client Details page from Dashboard Clients page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
