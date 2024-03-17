class Main {
 public yuyuval( String name,String special) {
	this.special= special;
	this.name= name;
	this.rate= 0;
}
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		yuyuval d1= new yuyuval("ita", "1");
		yuyuval d2= new yuyuval("yuva", "1");
		yuyuval d3= new yuyuval("miller", "1");
		yuyuval d4= new yuyuval("zen", "1");
		yuyuval[] doctor= {d1, d2, d3, d4};
		InsertRate(doctor);
		for(int i= 0; i<doctor.length; i++) {
			System.out.println(doctor[i].getRate());
		}
	}
	public static void InsertRate(yuyuval[] doctors) {
		for(int i = 0; i<doctors.length; i++) {
			int sum= 0;
			int count= 0;
			System.out.println("enter number");
			int num= reader.nextInt();
			while(num!=-1) {
				sum+=num;
				count++;
				System.out.println("enter number");
				num= reader.nextInt();
			}
			doctors[i].setRate((double) sum/count);
		}
	}
}
