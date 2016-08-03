package Example1;

public class Main {
	
	public static void Demo_Finaly(){
		ThoiGian Tg = new ThoiGian();
		try {
			//Tg.setNgay(-9);
			Tg.setNgay(19);
			System.out.println("ngay " + Tg.getNgay());
			return ;    // dừng hàm 
			
		} catch (ThoiGianException e) {
			e.printStackTrace();
			return;   // dừng hàm 
		}finally {
			System.out.println("Cho du return hàm nhưng Finally vẫn chạy");  
		}
		
	}
	public static void main(String[] args) {
		ThoiGian Tg = new ThoiGian();
		//bên hàm set ngày ủy thác nên bên này mới chạy try catch
		try {
			//Tg.setNgay(-9);
			Tg.setNgay(9);
			System.out.println("ngay " + Tg.getNgay());
			
		} catch (ThoiGianException e) {
			e.printStackTrace();
		}
		
		Main.Demo_Finaly();
	}
}
