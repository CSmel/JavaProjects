// This application will ask a user to input a quantity value and then it will perform a calculation.
// The calculation will use the NEW quantity number and then multiple it by the unit price (fixed price).
// The final result will display the cost for all purchases of the SAME product.
public class Invoice {
	private String partNum;	// instance variable
	private String partDesc; // instance variable
	private Integer quantity; // instance variable
	private Double pricePerItem; // instance variable


	// Invoice constructor
	public Invoice(String partNum, String partDesc, Integer quantity, Double pricePerItem) {
		this.partNum = partNum; // assign name to instance variable name
	    this.partDesc = partDesc; // assign name to instance variable name
		if (quantity > 0.0) { // if the quantity is valid and greater than 0.0.
			this.quantity = quantity; // assign it to the instance variable quantity
		}
		if (pricePerItem > 0) { // if the pricePerItem is valid and greater than 0
			this.pricePerItem = pricePerItem; // assign it to the instance variable pricePerItem
		}
	}

	// create a method that performs the calculation
	// first it will retrieve the quantity value, then it will multiply the price of the item.
	// the following method will update the values for the quantity, and pricePerItem variables.
	public void getInvoiceAmount(double quantityAmount) {
		if (quantityAmount > 0.0) { // if the amount is valid
			pricePerItem = pricePerItem * quantityAmount ;
			quantity = (int) quantityAmount; // quantity amount was originally a double then converts to an Integer
			// This is done so the application can display the quantity that was entered by the user.
		}
		
	}
	// method returns the part number
	public String getPartNum() {
		return partNum;
	}
	// method sets the part number
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	// method returns the part description
	public String getPartDesc() {
		return partDesc;
	}
	// method sets the part number
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	// method returns the quantity
	public Integer getQuantity() {
		return quantity;
	}
	// method sets the quantity
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	// method returns the price per item
	public Double getPricePerItem() {
		return pricePerItem;
	}
	// method sets the price per item
	public void setPricePerItem(Double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	

	
}
