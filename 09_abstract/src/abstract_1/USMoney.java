package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class USMoney extends Money {

	public USMoney(int money) {
		this.money = money;
	}

	@Override
	public void calcMoney() {
		exchange = money/1157.5;
	}

	public String getMoney() {
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		numberFormat.setMaximumFractionDigits(2);

		return numberFormat.format(exchange);
	}

}
