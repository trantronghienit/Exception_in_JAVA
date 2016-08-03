package Example1;

public class ThoiGian {
	private int ngay;
	private int thang;
	private int nam;
	
	
	
	public ThoiGian() {
		super();
	}

	public ThoiGian(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public int getNgay() {
		return ngay;
	}
	
	// TODO: tối ưu thì nên đánh dấu là nó có thể bị lỗi và người sử dụng hàm này phải sử lý ngoại lệ 
	// throws ThoiGianException đánh dấu có thể phát sinh ngoại lệ ai gọi phải xử lý 
	public void setNgay(int ngay) throws ThoiGianException{
		
		// làm vậy rất bất cập giả sử như làm trên form nếu làm vậy không thì sẽ không nhìn thấy trên form  
//		try {
			if(ngay < 0 || ngay > 31){
				throw new ThoiGianException();
			}	
			this.ngay = ngay;
//		} catch (ThoiGianException e) {
//			System.out.println("Gặp sự cố trên " + e.getMessage());
//		}
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
	
	
	

}
