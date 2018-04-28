package datastore;

/**
 * DATA ENCAPSULATION ELEMENT
 * Concrete class for DataStore class.
 * 
 * This class represents the concrete implementation of Data Store which handles GasPump1 specific storage operations.
 * @author cheth
 *
 */
public class DataStore1 extends DataStore {

	private float tempRPriceF;
	private float tempSPriceF;
	private float rPriceF;
	private float sPriceF;
	private float totalF;
	private int gallon;
	private float priceF;
	
	/*
	 * Getter method to return tempRPriceF value
	 */
	public float getTempRPriceF() {
		return tempRPriceF;
	}
	
	/*
	 * Setter method to store tempRpriceF value
	 * @see datastore.DataStore#setTempRPriceF(float)
	 */
	public void setTempRPriceF(float tempRPriceF) {
		this.tempRPriceF = tempRPriceF;
	}
	/*
	 * Getter method to return tempSPriceF value
	 * @see datastore.DataStore#getTempSPriceF()
	 */
	public float getTempSPriceF() {
		return tempSPriceF;
	}
	/*
	 * (non-Javadoc)
	 * @see datastore.DataStore#setTempSPriceF(float)
	 */
	public void setTempSPriceF(float tempSPriceF) {
		this.tempSPriceF = tempSPriceF;
	}
	/*
	 * Getter method to return rPriceF value
	 * @see datastore.DataStore#getRPriceF()
	 */
	public float getRPriceF() {
		return rPriceF;
	}
	/*
	 * Setter method to store rpriceF value
	 * @see datastore.DataStore#setRPriceF(float)
	 */
	public void setRPriceF(float rPriceF) {
		this.rPriceF = rPriceF;
	}
	/*
	 * Getter method to return sPriceF value
	 * @see datastore.DataStore#getSPriceF()
	 */
	public float getSPriceF() {
		return sPriceF;
	}
	/*
	 * Setter method to store spriceF value
	 * @see datastore.DataStore#setSPriceF(float)
	 */
	public void setSPriceF(float sPriceF) {
		this.sPriceF = sPriceF;
	}
	/*
	 * Getter method to return totalF value
	 * @see datastore.DataStore#getTotalF()
	 */
	public float getTotalF() {
		return totalF;
	}
	/*
	 *Setter method to store totalF value
	 * @see datastore.DataStore#setTotalF(float)
	 */
	public void setTotalF(float total) {
		this.totalF = total;
	}
	/*
	 * Getter method to return gallon value
	 * @see datastore.DataStore#getGallon()
	 */
	public int getGallon() {
		return gallon;
	}
	/*
	 * Setter method to store gallon value
	 * @see datastore.DataStore#setGallon(int)
	 */
	public void setGallon(int gallon) {
		this.gallon = gallon;
	}
	/*
	 * Getter method to return PriceF value
	 * @see datastore.DataStore#getPriceF()
	 */
	public float getPriceF() {
		return priceF;
	}
	/*
	 * Setter method to store priceF value
	 * @see datastore.DataStore#setPriceF(float)
	 */
	public void setPriceF(float priceF) {
		this.priceF = priceF;
	}
	
}
