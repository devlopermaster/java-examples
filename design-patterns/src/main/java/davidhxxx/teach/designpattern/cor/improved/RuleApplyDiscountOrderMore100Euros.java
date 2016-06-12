package davidhxxx.teach.designpattern.cor.improved;

import davidhxxx.teach.designpattern.cor.improved.common.AbstractRule;
import davidhxxx.teach.designpattern.cor.improved.common.IDiscountRule;
import davidhxxx.teach.designpattern.cor.improved.common.InputForDiscountRules;
import davidhxxx.teach.designpattern.cor.improved.common.Order;


public class RuleApplyDiscountOrderMore100Euros extends AbstractRule  implements IDiscountRule{

    public boolean apply(InputForDiscountRules inputDataForDiscountRules) {
Order order = inputDataForDiscountRules.getOrder();
	
	if (order.getPriceTotal() > 100) {
	    order.applyDiscountInPrct(0.1F);
	    return true;
	}
	return false;
    }

    
    public float getPrctDiscount() {
	return 0.1F;
    }

}
