import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.*
import internal.GlobalVariable

def processPayments(String projectId, List<Integer> methods) {
	String txtName = 'Nhi'
	String txtNameFurigana = 'ニックネームフリガナ'
	String txtMessage = 'hello'
	String homeUrl = GlobalVariable.HOME_URL
	def paymentMethods = [
		1: { CustomKeywords.'payment.PaymentKeywords.paymentBySavedCreditCard'() },
		2: { CustomKeywords.'payment.PaymentKeywords.paymentByNewCreditCard'() },
		3: { CustomKeywords.'payment.PaymentKeywords.paymentByVitualBank'() },
		4: { CustomKeywords.'payment.PaymentKeywords.paymentByAu'() },
		5: { CustomKeywords.'payment.PaymentKeywords.paymentBySoftBank'() },
		6: { CustomKeywords.'payment.PaymentKeywords.paymentByDocomo'() },
		7: { CustomKeywords.'payment.PaymentKeywords.paymentByBankTranfer'() },
		8: { CustomKeywords.'payment.PaymentKeywords.paymentByRakuten'() },
		9: { CustomKeywords.'payment.PaymentKeywords.paymentByCombini'() }
	]
	
    methods.each { method ->
        if (!paymentMethods.containsKey(method)) {
            throw new Exception("Invalid payment method: ${method}")
        }
        CustomKeywords.'cart.AddCardKeywords.addCart'(projectId)
        CustomKeywords.'cart.AddCardKeywords.inputOrderInfo'(
            txtName,
            txtNameFurigana,
            txtMessage
        )
        paymentMethods[method].call()
        waitForPageLoad(5)
        navigateToUrl(homeUrl)
    }
}

openBrowser('')
CustomKeywords.'auth.LoginKeywords.login'()
processPayments('7269', [6, 8])


