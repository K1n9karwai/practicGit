package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class JapanMoney extends Money{
	public JapanMoney(int money) {
		this.money = money;
	}
	
	@Override
	public void calcMoney() {
		exchange = money/10.64;
	}
	
	public String getMoney() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		numberFormat.setMaximumFractionDigits(2);
		
		return numberFormat.format(exchange);
	}

}
