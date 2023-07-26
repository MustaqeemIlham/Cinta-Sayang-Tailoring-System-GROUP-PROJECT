abstract class TailorOrder {

  private String custName ;
  public String orderNum;
  private double  deposit,dev;
  private double  delivery ;
  private double balance;
  private String address;
  private String phoneNum;
  static int ct =0;


  public TailorOrder(){



  }
  public TailorOrder(String nm,String rs,double dp,String on){

	  custName = nm;
	  phoneNum = rs;
	  deposit = dp;
	  orderNum  = on;
	  delivery = 5.00;
      balance = deposit;

  }






  public String setdata(String ad) {

	  address = ad;
	  return address;
  }


  public abstract double payment(int typ,int qtt);


  public String getName() {
	  return custName;
  }
  public String getorderNum() {
	  return orderNum;
  }
  public double getdeposit() {
	  return deposit;
  }
  public double getdelivery() {
	  return delivery;
  }
  public double getbalance() {
	  return balance;
  }
  public String getaddress() {
	  return address;
  }



  public String getphoneNum() {
	  return phoneNum;
  }

}