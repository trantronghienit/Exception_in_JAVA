package Example;


// Exception mình tự định nghĩa
public class SoAmException extends Exception {

	
	// viết lại hàm getMessage
	@Override
	public String getMessage() {
		return "Nhập số nhỏ Hơn 0 " + super.getMessage();
	}
	
}
