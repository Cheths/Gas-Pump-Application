package datastore;

/**
 * DATA ENCAPSULATION ELEMENT
 * Abstract class for DataStore1 and DataStore2 classes.
 * 
 * This class represents the abstract class for the Data Store which 
 * is used to group all the various data store concrete classes within the implementation.
 * @author cheth
 *
 */
public abstract class DataStore {

	/*
	 * Methods below are abstract and child classes have the implementation.
	 */
	//for GP1
	public float getTempRPriceF(){ return 0; }
	
	public void setTempRPriceF(float f){}
	
	public float getTempSPriceF(){ return 0; }
	
	public void setTempSPriceF(float f){}
	
	public float getRPriceF() { return 0; }

	public void setRPriceF(float rPrice) {}

	public float getSPriceF() { return 0; }

	public void setSPriceF(float sPrice) {}
	
	public float getTotalF() { return 0; }

	public void setTotalF(float total) {}
	
	public int getGallon() { return 0; }

	public void setGallon(int g) {}
	
	public float getPriceF(){ return 0; }
	
	public void setPriceF(float price){}
	
	
	//for GP2
	public int getTempRPriceI(){ return 0; }
	
	public void setTempRPriceI(int i){}
	
	public int getTempSPriceI(){ return 0; }
	
	public void setTempSPriceI(int i){}
	
	public int getTempPPriceI(){ return 0; }
	
	public void setTempPPriceI(int i){}
	
	public int getRPriceI() { return 0; }

	public void setRPriceI(int rPrice) {}

	public int getSPriceI() { return 0; }

	public void setSPriceI(int sPrice) {}

	public int getPPriceI() { return 0; }

	public void setPPriceI(int pPrice) {}
	
	public float getTempCash(){ return 0; }
	
	public void setTempCash(float cash){}
	
	public float getCash() { return 0; }

	public void setCash(float cash) {}
	
	public int getPriceI(){ return 0; }
	
	public void setPriceI(int price){}
	
	public int getLiter(){ return 0; }
	
	public void setLiter(int l){}
	
	public int getTotalI() { return 0; }
	
	public void setTotalI(int price) {}
}
