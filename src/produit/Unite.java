package produit;

public enum Unite {
	Litre("l"), Kilogramme("kg");

	private String unite;

	private Unite(String unite) {
		this.unite = unite;
	}

	public String getUnite() {
		return unite;
	}

}
