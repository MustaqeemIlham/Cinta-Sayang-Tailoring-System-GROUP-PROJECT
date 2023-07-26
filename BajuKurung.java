class BajuKurung extends TailorOrder {

    private int type;
    private String name,phone,ordernum;
    private double embriodery,embrio,charge,deposit;
    int qt,b=0,dt2=0,dt3=0,dt4=0,dt5=0;
    private double total2=0,total1,total3,total4,payment,total5,calc,calc1;
    private double pay1,pay2,pay3,pay4,noEmb,yesEmb,totalprice;


    public BajuKurung(String nm,String pn,double dp,String on) {

           super(nm,pn,dp,on);
           type = 0;
           embriodery = 0;




    }



    public double embr(double em1,double em2) {

       if(em1 == em1){
          calc = 0 * 25.00;
          noEmb =  calc;
       }

       if (em2 == em2){

          calc1 = em2 * 25.00;
          yesEmb = calc1;
       }



        embriodery =  yesEmb + noEmb;
        return embriodery;
  }




        public double payment(int qty, int tp) {


        if(tp == 1){


            pay1 = 30.00 * qty;
            this.total1 = total1 + pay1;
           dt2 = qty ;

        }
        else if(tp == 2) {


            pay2 = 60.00 * qty;
            this.total3 = this.total3 + pay2;
            dt3 = qty;
        }
        else if(tp == 3) {


            pay3 = 55.00 * qty;
            this.total4 = this.total4 + pay3;
            dt4 = qty ;

        }
        else if(tp == 4) {

            pay4 = 110 * qty;
            this.total5  = total5 + pay4;
            dt5 = qty ;

        }

         totalprice = total3 + total5 + total4 + total1;
        return totalprice;

    }

    public double getAmbriodery() {
        return embriodery;
    }

     public int getKurungNormal() {return dt2;}
     public int getKurungLining() {return dt3;}
     public int getKebayaNormal() {return dt4;}
     public int getKebayaLining() {return dt5;}

    public double getpayment(){
        return totalprice;
    }

}