/**
 * 
 */
package algorithm;

/**
 * @author Carlos Vazquez
 *
 */
public class Playfair {
	private String keyword;
	private String plainText;
	private String cipherText;
	private String[][] grid;
	/**
	 * @param keyword
	 * @param plainText
	 * @param cipherText
	 * @param grid
	 */
	public Playfair(String keyword, String plainText, String cipherText, String[][] grid) {
		this.keyword = keyword;
		this.plainText = plainText;
		this.cipherText = cipherText;
		this.grid = grid;
	}
	
	@SuppressWarnings("unused")
	private Playfair(){}

	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * @return the plainText
	 */
	public String getPlainText() {
		return plainText;
	}

	/**
	 * @param plainText the plainText to set
	 */
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	/**
	 * @return the cipherText
	 */
	public String getCipherText() {
		return cipherText;
	}

	/**
	 * @param cipherText the cipherText to set
	 */
	public void setCipherText(String cipherText) {
		this.cipherText = cipherText;
	}

	/**
	 * @return the grid
	 */
	public String[][] getGrid() {
		return grid;
	}

	/**
	 * @param grid the grid to set
	 */
	public void setGrid(String[][] grid) {
		this.grid = grid;
	}
	
	
}
