package classes;

public class Indice {
	private String nom;
	private float poid, taille;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPoid() {
		return poid;
	}

	public void setPoid(float poid) {
		this.poid = poid;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public int calcule() {
		double imc = poid / (Math.pow(taille, 2));
		return (int) Math.round(imc);

	}

	public String evaluer() {
		int masse = calcule();
		if (masse < 20) {
			return "maigre";
		} else if (masse <= 25)
			return "idéale";
		else
			return "surpoid";

	}

}
