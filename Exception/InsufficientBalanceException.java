package Exception;

public class InsufficientBalanceException  extends Exception {
	
	private String message="";

	public InsufficientBalanceException() {
		  super();
	} 
	public InsufficientBalanceException( String message ) { 
		super();
	 this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void showError() {
		System.out.println(" Message : "+this.getMessage());
	}

}
