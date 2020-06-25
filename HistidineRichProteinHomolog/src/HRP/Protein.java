package HRP;

public class Protein {
	private String id;
	private char[] sequence;
	private int length;
	private int histidineContent;
	
	public Protein(String id, char[] sequence, int length) {
		this.id = id;
		this.sequence = sequence;
		this.length = length;
	}
}
