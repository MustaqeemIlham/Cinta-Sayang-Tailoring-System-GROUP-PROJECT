class BajuMelayu extends TailorOrder {


    private int type;
    int  dt,dt1,totalcm;
    private double total1,total2,qt1,qt2;
	private double total3,total5;
	double total4,totalprice;



	public BajuMelayu(String nm,String pn,double dp,String on) {

		  super(nm,pn,dp,on);
	      type = 0;


	}

	//setter


	public double payment(int qt,int tp) {


		if(tp == 1){

		   qt1 = 75.00 * qt;
		   total1 = qt1;
           dt = dt + qt;

		}

		else if(tp == 2) {

		    qt2 = 95.00 * qt;
		    total2 =  qt2;
		    dt1 =  dt1 + qt;


		}
          totalprice = total1 + total2;
          return totalprice;

	}

	 public int  getCekakMusang() {

		 return dt;

	 }

	 public int getTelukBelanga() {

		 return dt1;


	 }

	 public double getprice(){
         return totalprice;


	 }
	 public double gettotal1(){
		 return total1;

	 }
	 public double gettotal2(){
		 return total2;
	 }

}