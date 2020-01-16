package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class ChinaMoney extends Money {

	public ChinaMoney(int money) {
		this.money = money;
	}

	@Override
	public void calcMoney() {
		exchange = money/166.36;
	}

	public String getMoney() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		numberFormat.setMaximumFractionDigits(2);
		
		return numberFormat.format(exchange);
	}

}
