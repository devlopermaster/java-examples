package davidhxxx.teach.designpattern.mediator;

import davidhxxx.teach.designpattern.mediator.common.IDiscountRule;
import davidhxxx.teach.designpattern.mediator.common.InputForDiscountRules;
import davidhxxx.teach.designpattern.mediator.common.Order;

public class RuleApplyDiscountOrderMore200Euros implements IDiscountRule {

	public boolean apply(InputForDiscountRules inputDataForDiscountRules) {
		Order order = inputDataForDiscountRules.getOrder();

		if (order.getPriceTotal() > 200) {
			order.applyDiscountInPrct(getPrctDiscount());
			return true;
		}
		return false;

	}

	public float getPrctDiscount() {
		return 0.25F;
	}

}
