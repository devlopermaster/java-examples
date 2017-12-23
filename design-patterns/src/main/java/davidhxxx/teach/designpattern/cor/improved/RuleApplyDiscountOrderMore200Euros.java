package davidhxxx.teach.designpattern.cor.improved;

import davidhxxx.teach.designpattern.cor.improved.common.AbstractDiscountRule;
import davidhxxx.teach.designpattern.cor.improved.common.IDiscountRule;
import davidhxxx.teach.designpattern.cor.improved.common.InputForDiscountRules;
import davidhxxx.teach.designpattern.cor.improved.common.Order;

public class RuleApplyDiscountOrderMore200Euros extends AbstractDiscountRule implements IDiscountRule {

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
