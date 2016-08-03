package Example;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Exception là cha của ArithmeticException , InputMismatchException
 * nên luôn đặt catch ở phía dưới nếu không luôn luôn ưu tiên nhảy vào Exception
 * */

public class Try_catch_throw_throws {
	
	public static void main(String[] args) {
	    int SoA;
		int SoB;
		int Ketqua;
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("nhap A: ");
			SoA = scan.nextInt();
			System.out.println("nhap B: ");
			SoB = scan.nextInt();
			// tự định nghĩa ngoại lệ riêng mình ví dụ a và b phải lớn hơn không
			if(SoA < 0 || SoB < 0){
				//Exception ex= new Exception("Sự cố nhập số âm");
				Exception ex = new SoAmException();
				throw ex;    // throw luôn đi kèm với điều kiện 
								// nếu gặp throw nó sẽ nhảy xuông catch nào new đối tượng Exception
			}
			Ketqua = SoA / SoB;
			System.out.println("ket qua :" + Ketqua);
		}catch(ArithmeticException e){
			System.out.println("gap sự cố chia số 0" + e.getMessage());
		}catch(InputMismatchException e){
			e.printStackTrace();   // show loại Exception dùng để debug
			System.out.println("gap sự cố kiễu dự liệu không đúng " + e.getMessage());
		}catch (SoAmException e) {
			System.out.println("bạn nhập A hoặc B không đúng " + e.getMessage());
		}
		catch(Exception e){    
			System.out.println("ngoại lệ khác!! " + e.getMessage());
		}
		
	}
	

}
