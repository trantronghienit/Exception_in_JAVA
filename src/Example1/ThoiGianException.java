package Example1;

import java.io.PrintStream;

public class ThoiGianException extends Exception{
	
	@Override
	public String getMessage() {
		return "Giá Trị Truyền Vào Không Đúng";
	}
	
	
	@Override
	public void printStackTrace(PrintStream s) {
		System.out.println("đã gặp lỗi " + getStackTrace());
	}

}
