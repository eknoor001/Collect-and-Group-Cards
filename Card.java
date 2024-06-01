package collect_and_group_cards;

public class Card {

	private String symbol;
	private int number;
	
	public Card() {
		super();
	}

	public Card(String symbol, int number) {
		super();
		this.symbol = symbol;
		this.number = number;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [symbol=" + symbol + ", number=" + number + "]";
	}
	
	
	
	
}
