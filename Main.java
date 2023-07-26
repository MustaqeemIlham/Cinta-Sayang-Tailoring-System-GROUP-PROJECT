import java.util.Scanner;
import java.io.IOException;
import java.util.Random;



 class Main {

    public static void clrscr() throws Exception
   	    {
   	        Scanner sc = new Scanner(System.in);
   	        Scanner scLine = new Scanner(System.in);
   	        scLine.nextLine();
   	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   	    }

   	    String fhoneNumber;
   	    static String  i = "yes",dv="";
   	    static boolean res1,com,dev;
   	    static int tcm,ttb,tkn,tkl,tkb,tkbl,emb1,emb2,emb3,emb4,dt6,dt7,dt8,dt9;
   	    static double charge,payment,bmprice,bkprice,deliveryService;
   	    static int totBk =0,totBm=0,ff,dd=0,bm,bk,totBm1,totBk1,totBk2,totBk3,tot,tc;
   	    static String add = "yes",add2 = "yes";
   	    //static BajuMelayu customer1[] = new BajuMelayu[100];
   	    //static BajuKurung customer[] = new BajuKurung[100];
   	    static int vv;
           //static int cm = 0,n=0,l=0,k=0,kl=0;
   		static      int tb = 0;
   	    static  int len = 0;


   	    public static void main(String[] args) throws Exception
   	    {
               BajuMelayu customer1[] = new BajuMelayu[100];
               BajuKurung customer[] = new BajuKurung[100];
   	        Scanner sc = new Scanner(System.in);
   	        //Main mn[] = new Main[100];
   	        Scanner scLine = new Scanner(System.in);
   	        //customer1[cm] = new BajuMelayu();
   	        //customer[n] = new BajuKurung();
   	        int cm = 0,n=0,l=0,k=0,kl=0;
   	        for(;;){
   	            Choice();
   	            int ch = sc.nextInt();
   	            clrscr();

   	            if(ch == 1){

   	                ChoiceBajumelayu();
   	                bm = sc.nextInt();

   	                if (bm == 1){

   	                    sc.nextLine();

   	                    System.out.print("\n\t\t\t\tInsert customer name: ");
   	                    String name = scLine.nextLine();
   	                    System.out.print("\t\t\t\tInsert Phone number: ");
   	                    String phoneNumber = scLine.nextLine();
   	                    System.out.print("\t\t\t\tInsert the amount of deposit: " + "RM");
   	                    double deposit= sc.nextDouble();
   	                    String hold = name;
   	                    int lenght = 5;
   	                    String on =  name + phoneNumber;
   	                    StringBuilder sb = new StringBuilder();
   	                    Random random = new Random();
   	                    for(int a = 0;a<lenght;a++) {

   	                        int rand = random.nextInt(on.length());
   	                        char randomChar = on.charAt(rand);

   	                        sb.append(randomChar);

   	                    }

   	                    String randomstring = sb.toString().toUpperCase();

   	                    customer1[cm] = new BajuMelayu(name, phoneNumber, deposit, randomstring);
   	                    System.out.print("\n\t\t\t\tThe quantity of Baju Melayu Cekak Musang: ");
   	                    int qty = sc.nextInt();
   	                    tcm = tcm + qty;
   	                    customer1[cm].payment(qty,bm);
   	                    totBm = totBm + qty;

   	                    System.out.print("\t\t\t\tDelivery Service? (RM5) [yes/no]: ");
   	                    dv = scLine.nextLine();

   	                    if(dv.equalsIgnoreCase("yes")) {

   	                        System.out.print("\t\t\t\tCustomer Info [Address]: ");
   	                        String add = scLine.nextLine();

   	                        System.out.println("\t\t\t\tCharge for delivery service is " + "RM" + 5.00 );
   	                        System.out.println("\t\t\t\tDelivery Address: " + add);
   	                        System.out.println("\t\t\t\tThe total price include delivery that has to be paid is " + "RM" + ((customer1[cm].getprice() - customer1[cm].getbalance()) + customer1[cm].getdelivery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer1[cm].getorderNum());
                               customer1[cm].setdata(add);
   	                    }
   	                    else if(dv.equalsIgnoreCase("no")){
   	                        System.out.println("\n\t\t\t\tTotal balance " + customer1[cm].getName() + " has to be paid is " + "RM" + ((customer1[cm].getprice() - customer1[cm].getbalance())));
   	                        System.out.println("\t\t\t\tOrder number: " + customer1[cm].getorderNum());

   	                    }

                           cm++;
   	                    clrscr();

   	                }

   	                else if(bm == 2){
   	                    sc.nextLine();


   	                    System.out.print("\n\t\t\t\tInsert customer name: ");
   	                    String name = sc.nextLine();
   	                    System.out.print("\t\t\t\tInsert Phone number: ");
   	                    String phoneNumber = sc.nextLine();
   	                    System.out.print("\t\t\t\tInsert the amount of deposit: RM");
   	                    double deposit= sc.nextDouble();

   	                    int lenght = 5;
   	                    String on =  name + phoneNumber;
   	                    StringBuilder sb = new StringBuilder();
   	                    Random random = new Random();
   	                    for(int a = 0;a<lenght;a++) {

   	                        int rand = random.nextInt(on.length());
   	                        char randomChar = on.charAt(rand);

   	                        sb.append(randomChar);
   	                    }

   	                    String randomstring = sb.toString().toUpperCase();

   	                    customer1[cm] = new BajuMelayu(name, phoneNumber, deposit, randomstring);
   	                    System.out.print("\n\t\t\t\tThe quantity of Baju Melayu Teluk Belanga: ");
   	                    int qty1 = sc.nextInt();
                        ttb = ttb + qty1;
   	                    customer1[cm].payment(qty1, bm);
   	                    totBm = totBm +  qty1;

   	                    System.out.print("\t\t\t\tDelivery Service? (RM5) [yes/no]: ");
   	                    dv = scLine.nextLine();
   	                    if(dv.equalsIgnoreCase("yes")){

   	                        System.out.print("\t\t\t\tCustomer Info [Address]: ");
   	                        String add = scLine.nextLine();
   	                        System.out.println("\t\t\t\tCharge for delivery service: RM5.00 ");
   	                        System.out.println("\t\t\t\tDelivery Address: " + add);
   	                        System.out.println("\t\t\t\tThe total price include delivery that has to be paid is: RM" + ((customer1[cm].getprice() - customer1[cm].getbalance()) + customer1[cm].getdelivery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer1[cm].getorderNum());
   	                        customer1[cm].setdata(add);
   	                    }
   	                    else if(dv.equalsIgnoreCase("no")){
   	                        System.out.println("\n\t\t\t\tTotal balance " + customer1[cm].getName() + " has to be paid is: RM" + ((customer1[cm].getprice() - customer1[cm].getbalance())));
   	                        System.out.println("\t\t\t\tOrder number: " + customer1[cm].getorderNum());

   	                    }

                           cm++;
   	                    clrscr();


   	                }

   	            }



   	            else if (ch == 2){
   	                ChoiceBajukurung();
   	                bk = sc.nextInt();

   	                if(bk == 1){
   	                    sc.nextLine();

   	                    System.out.print("\n\t\t\t\tInsert customer name: ");
   	                    String name = sc.nextLine();
   	                    System.out.print("\t\t\t\tInsert Phone number: ");
   	                    String phoneNumber = sc.nextLine();

   	                    System.out.print("\t\t\t\tInsert the amount of deposit: RM");
   	                    double deposit= sc.nextDouble();

   	                    int lenght = 5;
   	                    String on =  name + phoneNumber;
   	                    StringBuilder sb = new StringBuilder();
   	                    Random random = new Random();
   	                    for(int a = 0;a<lenght;a++) {

   	                        int rand = random.nextInt(on.length());
   	                        char randomChar = on.charAt(rand);

   	                        sb.append(randomChar);
   	                    }

   	                    String randomstring = sb.toString().toUpperCase();
   	                    customer[n] = new BajuKurung(name, phoneNumber, deposit, randomstring);
   	                    System.out.print("\n\t\t\t\tThe quantity of Baju Kurung Normal: ");
   	                    int qty1 = sc.nextInt();
   	                    System.out.println("\t\t\t\tEmbroidery charge is RM25");
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kurung Normal you want without embroidery: ");
   	                    int emb = sc.nextInt();
   	                    tkn = tkn + emb;
   	                    sc.nextLine();
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kurung Normal you want with embroidery: ");
   	                    emb1 = sc.nextInt();
   	                    if(emb1>0){
   	                        dt6 = dt6 + emb1;
   	                    }
   	                    customer[n].payment(qty1,bk);
   	                    totBk = totBk + qty1;
   	                    customer[n].embr(emb, emb1);
   	                    System.out.print("\t\t\t\tDelivery Service? (RM5) [yes/no]: ");
   	                    dv = scLine.nextLine();
   	                    if(dv.equalsIgnoreCase("yes")){

   	                        System.out.print("\t\t\t\tCustomer Info [Address]: ");
   	                        String add = scLine.nextLine();
   	                        System.out.println("\t\t\t\tCharge for delivery service: RM5.00 ");
   	                        System.out.println("\t\t\t\tDelivery Address: " + add);
   	                        System.out.println("\t\t\t\tThe total price include delivery that has to be paid is: RM" + ((customer[n].getpayment() - customer[n].getbalance()) + customer[n].getdelivery() + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer[n].getorderNum());
   	                        customer[n].setdata(add);
   	                    }
   	                    else if(dv.equalsIgnoreCase("no")){
   	                        System.out.println("\n\t\t\t\tTotal balance " + customer[n].getName() + " has to be paid is: RM" + ((customer[n].getpayment() - customer[n].getbalance()) + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer[n].getorderNum());

   	                    }
   	                    n++;
   	                    clrscr();
   	                }

   	                else if (bk == 2){
   	                    sc.nextLine();

   	                    System.out.print("\n\t\t\t\tInsert customer name: ");
   	                    String name = sc.nextLine();
   	                    System.out.print("\t\t\t\tInsert Phone number: ");
   	                    String phoneNumber = sc.nextLine();
   	                    System.out.print("\t\t\t\tInsert the amount of deposit: RM");
   	                    double deposit= sc.nextDouble();

   	                    int lenght = 5;
   	                    String on =  name + phoneNumber;
   	                    StringBuilder sb = new StringBuilder();
   	                    Random random = new Random();
   	                    for(int a = 0;a<lenght;a++) {

   	                        int rand = random.nextInt(on.length());
   	                        char randomChar = on.charAt(rand);

   	                        sb.append(randomChar);
   	                    }
   	                    String randomstring = sb.toString().toUpperCase();
   	                    customer[n] = new BajuKurung(name, phoneNumber, deposit, randomstring);
   	                    System.out.print("\n\t\t\t\tThe quantity of Baju Kurung Lining: ");
   	                    int qty2 = sc.nextInt();
   	                    System.out.println("\t\t\t\tEmbroidery charge for RM25");
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kurung Lining you want without embroidery: ");
   	                    int emb = sc.nextInt();
   	                     tkl = tkl + emb;
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kurung Lining you want with embroidery: ");
   	                    emb2 = sc.nextInt();
   	                    if(emb2>0){
   	                        dt7 = dt7 + emb2;
   	                    }
   	                    customer[n].payment(qty2,bk);
   	                    totBk = totBk + qty2;
   	                    customer[n].embr(emb, emb2);
   	                    System.out.print("\t\t\t\tDelivery Service? (RM5) [yes/no]: ");
   	                    dv = scLine.nextLine();
   	                    if(dv.equalsIgnoreCase("yes")) {

   	                        System.out.print("\t\t\t\tCustomer Info [Address]: ");
   	                        String add = scLine.nextLine();
   	                        System.out.println("\t\t\t\tCharge for delivery service: RM5.00 ");
   	                        System.out.println("\t\t\t\tDelivery Address: " + add);
   	                        System.out.println("\t\t\t\tThe total price include delivery that has to be paid is: RM" + ((customer[n].getpayment() - customer[n].getbalance()) + customer[n].getdelivery() + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer[n].getorderNum());
   	                        customer[n].setdata(add);
   	                    }
   	                    else if(dv.equalsIgnoreCase("no")){
   	                        System.out.println("\t\t\t\tTotal balance " + customer[n].getName() + " has to be paid is: RM" + ((customer[n].getpayment() - customer[n].getbalance()) + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number:  " + customer[n].getorderNum());

   	                    }
   	                    n++;
   	                    clrscr();
   	                }

   	                else if(bk == 3){
   	                    sc.nextLine();

   	                    System.out.print("\n\t\t\t\tInsert customer name: ");
   	                    String name = scLine.nextLine();
   	                    System.out.print("\t\t\t\tInsert Phone number: ");
   	                    String phoneNumber = sc.nextLine();
   	                    System.out.print("\t\t\t\tInsert the amount of deposit: RM");
   	                    double deposit= sc.nextDouble();

   	                    int lenght = 5;
   	                    String on =  name + phoneNumber;
   	                    StringBuilder sb = new StringBuilder();
   	                    Random random = new Random();

   	                    for(int a = 0;a<lenght;a++) {
   	                        int rand = random.nextInt(on.length());
   	                        char randomChar = on.charAt(rand);
   	                        sb.append(randomChar);
   	                    }
   	                    String randomstring = sb.toString().toUpperCase();
   	                    customer[n] = new BajuKurung(name, phoneNumber, deposit, randomstring);

   	                    System.out.print("\n\t\t\t\tThe quantity of Baju Kebaya Normal: ");
   	                    int qty3 = sc.nextInt();
   	                    System.out.println("\t\t\t\tEmbroidery charge for RM25");
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kebaya Normal you want without embroidery: ");
   	                    int emb = sc.nextInt();
   	                    tkb = tkb + emb;
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kebaya Normal you want with embroidery: ");
   	                    emb3 = sc.nextInt();
   	                    if(emb3>0){
   	                        dt8 = dt8 + emb3;
   	                    }
   	                    customer[n].payment(qty3,bk);
   	                    totBk = totBk + qty3;
   	                    sc.nextLine();
   	                    customer[n].embr(emb, emb3);System.out.println("Delivery Service? [yes/no]: ");
   	                    dv = scLine.nextLine();
   	                    if(dv.equalsIgnoreCase("yes")) {

   	                        System.out.print("\t\t\t\tDelivery Service? (RM5) [yes/no]: ");
   	                        String add = scLine.nextLine();
   	                        System.out.println("\t\t\t\tCharge for delivery service: RM5.00 ");
   	                        System.out.println("\t\t\t\tDelivery Address: " + add);
   	                        System.out.println("\t\t\t\tThe total price include delivery that has to be paid is: RM" + (customer[n].getpayment() - customer[n].getbalance()) + (customer[n].getdelivery() + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer[k].getorderNum());
   	                        customer[n].setdata(add);
   	                    }
   	                    else if(dv.equalsIgnoreCase("no")){
   	                        System.out.println("\n\t\t\t\tTotal balance " + customer[n].getName()+ " has to be paid is: RM" + ((customer[n].getpayment() - customer[n].getbalance()) + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer[n].getorderNum());

   	                    }
   	                    n++;
   	                    clrscr();
   	                }

   	                else if (bk == 4){
   	                    sc.nextLine();

   	                    System.out.print("\n\t\t\t\tInsert customer name: ");
   	                    String name = scLine.nextLine();
   	                    System.out.print("\t\t\t\tInsert Phone number: ");
   	                    String phoneNumber = scLine.nextLine();
   	                    System.out.print("\t\t\t\tInsert the amount of deposit: RM");
   	                    double deposit= sc.nextDouble();

   	                    int lenght = 5;
   	                    String on =  name + phoneNumber;
   	                    StringBuilder sb = new StringBuilder();
   	                    Random random = new Random();
   	                    for(int a = 0;a<lenght;a++) {

   	                        int rand = random.nextInt(on.length());
   	                        char randomChar = on.charAt(rand);

   	                        sb.append(randomChar);
   	                    }
   	                    String randomstring = sb.toString().toUpperCase();
   	                    customer[n] = new BajuKurung(name, phoneNumber, deposit, randomstring);

   	                    System.out.print("\n\t\t\t\tThe quantity of Baju Kebaya Lining: ");
   	                    int qty4 = sc.nextInt();
   	                    System.out.println("\t\t\t\tEmbroidery charge for RM25");
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kebaya Lining you want without embroidery: ");
   	                    int emb = sc.nextInt();
   	                    tkbl = tkbl + emb;
   	                    System.out.print("\t\t\t\tThe quantity of Baju Kebaya Lining you want with embroidery: ");
   	                    emb4 = sc.nextInt();
   	                    System.out.print("\t\t\t\tDelivery Service? (RM5) [yes/no]: ");
   	                    String dv = scLine.nextLine();
   	                    if(emb4>0){
   	                        dt9 = dt9 + emb4;
   	                    }
   	                    customer[n].payment(qty4,bk);
   	                    totBk = totBk + qty4;
   	                    customer[n].embr(emb, emb4);
   	                    if(dv.equalsIgnoreCase("yes")) {

   	                        System.out.print("\t\t\t\tCustomer Info [Address]: ");
   	                        String add = scLine.nextLine();
   	                        System.out.println("\t\t\t\tCharge for delivery service: RM5.00 ");
   	                        System.out.println("\t\t\t\tDelivery Address: " + add);
   	                        System.out.println("\t\t\t\tThe total price include delivery that has to be paid is: RM" + (customer[n].getpayment() - customer[n].getbalance()) + customer[n].getdelivery() + customer[n].getAmbriodery());
   	                        System.out.println("\t\t\t\tOrder number: " + customer[n].getorderNum());
   	                        customer[n].setdata(add);
   	                    }
   	                    else if(dv.equalsIgnoreCase("no")){
   	                        System.out.println("\n\t\t\t\tTotal balance " + customer[n].getName() + " has to be paid is: RM" + ((customer[n].getpayment() - customer[n].getbalance()) + customer[n].getAmbriodery()));
   	                        System.out.println("\t\t\t\tOrder number: " + customer[n].getorderNum());

   	                    }
   	                    n++;
   	                    clrscr();
   	                }

   	            }

   	            else if(ch == 3){

			       System.out.println("\n\t\t\t\tBaju Melayu Cekak Musang: " + tcm );
			       System.out.println("\t\t\t\tBaju Melayu Teluk Belanga: " + ttb);
			       System.out.println("\t\t\t\tBaju Kurung Normal: " + tkn);
				   System.out.println("\t\t\t\tBaju Kurung Lining: " + tkl);
				   System.out.println("\t\t\t\tBaju Kebaya Normal: " + tkb);
   	               System.out.println("\t\t\t\tBaju Kebaya Lining: " + tkbl);
			       System.out.println("\t\t\t\tBaju Kurung Normal with embriodery: " + dt6);
				   System.out.println("\t\t\t\tBaju Kurung Lining with embriodery: " + dt7);
				   System.out.println("\t\t\t\tBaju Kebaya Normal with embriodery: " + dt8);
   	               System.out.println("\t\t\t\tBaju Kebaya Lining with embriodery: " + dt9);
                   clrscr();
   	            }


   	            else if(ch == 4){

   	                System.out.println("\t\t\t\tTotal of Baju Melayu ordered is: " + totBm);
   	                System.out.println("\t\t\t\tTotal of Baju Kurung ordered is: " + totBk);
                    clrscr();

   	            }

   	            else if (ch == 5) {

                typechoice();
                tc = sc.nextInt();


                if(tc == 1){

   	            displayChoice();
   	            int c = sc.nextInt();


   	            if(c == 1){

   	            System.out.print("\n\t\t\t\tOrder number: ");
   	            String on = scLine.nextLine();

			    for(int i=0;i<customer1.length;i++){
				clrscr();

   	            if(customer1[i] instanceof BajuMelayu)
   			    {
			    if(customer1[i].getorderNum().equals(on))
                {

   		        if(dv.equalsIgnoreCase("yes")){
                System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name", "\t\tAddress\n");
				System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer1[i].getorderNum(),"\t\t" + ((customer1[i].getprice() - customer1[i].getbalance()) + customer1[i].getdelivery()),"\t\t\t" + customer1[i].getName(),"\t\t\t" + customer1[i].getaddress());
                clrscr();
                break;


   				}
   				else if(dv.equalsIgnoreCase("no")){

                System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
 			    System.out.format ("\n\t\t" + "%-10s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name");
 				System.out.format ("\n\t\t" + "%-10s %8s %8s",  customer1[i].getorderNum(),"\t\t" + (customer1[i].getprice() - customer1[i].getbalance()),"\t\t\t" + customer1[i].getName());
                clrscr();
                break;

                }

              }

              else{
				  System.out.println("PLEASE INPUT THE RIGHT ORDER NUMBER!");
				  clrscr();
				  break;
			  }

}
}
}

			    else  if(c == 2){
				System.out.print("\n\t\t\t\tName: ");
			    String nm = scLine.nextLine();

			    for(int i=0;i<customer1.length;i++){
				clrscr();

			    if(customer1[i] instanceof BajuMelayu)
			    {
				if(customer1[i].getName().equals(nm))
                {
			    if(dv.equalsIgnoreCase("yes")){

                System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name", "\t\tAddress\n");
				System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer1[i].getorderNum(),"\t\t" + ((customer1[i].getprice() - customer1[i].getbalance()) + customer1[i].getdelivery()),"\t\t\t" + customer1[i].getName(),"\t\t\t" + customer1[i].getaddress());
                clrscr();
                break;
			    }

			    else if(dv.equalsIgnoreCase("no")){

                System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.format ("\n\t\t" + "%-10s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name");
				System.out.format ("\n\t\t" + "%-10s %8s %8s",  customer1[i].getorderNum(),"\t\t" + (customer1[i].getprice() - customer1[i].getbalance()),"\t\t\t" + customer1[i].getName());
                clrscr();
                break;

			     }
			 }
			     else{
			     System.out.println("PLEASE INPUT THE RIGHT NAME!");
			     clrscr();
			     break;
			  }

}
		 }
	 }
			    else  if(c == 3){

				System.out.print("\n\t\t\t\tPhone Number: ");
				String pn = scLine.nextLine();

	            for(int i=0;i<customer1.length;i++){
			    clrscr();

			    if(customer1[i] instanceof BajuMelayu)
				{
                if(customer1[i]. getphoneNum().equals(pn)){
			    if(dv.equalsIgnoreCase("yes")){
                System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name", "\t\tAddress\n");
				System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer1[i].getorderNum(),"\t\t" + ((customer1[i].getprice() - customer1[i].getbalance()) + customer1[i].getdelivery()),"\t\t\t" + customer1[i].getName(),"\t\t\t" + customer1[i].getaddress());
                clrscr();
                break;

				}
			    else if(dv.equalsIgnoreCase("no")){

                System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			    System.out.format ("\n\t\t" + "%-10s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name");
				System.out.format ("\n\t\t" + "%-10s %8s %8s",  customer1[i].getorderNum(),"\t\t" + (customer1[i].getprice() - customer1[i].getbalance()),"\t\t\t" + customer1[i].getName());
                clrscr();
                break;

				}
			    }
                else{
			    System.out.println("PLEASE INPUT THE RIGHT PHONE NUMBER!");
			    clrscr();
			    break;

			  }
			   }
           }

 }

}

}
			    if(tc == 2) {
                displayChoice();
					int c = sc.nextInt();

					 if(c == 1){

				     System.out.print("\n\t\t\t\tOrder Number: ");
				     String on = scLine.nextLine();

					 for(int i=0;i<customer.length;i++){
					 clrscr();

					 if(customer[i] instanceof BajuKurung)
					 {
				     if(customer[i].getorderNum().equals(on))
				     {

					 if(dv.equalsIgnoreCase("yes")){

                     System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name", "\t\tAddress\n");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer[i].getorderNum(),"\t\t" + ((customer[i].getpayment() - customer[i].getbalance()) + customer[i].getdelivery()),"\t\t\t" + customer[i].getName(),"\t\t\t" + customer[i].getaddress());
                     clrscr();
                     break;

					 }
				     else if(dv.equalsIgnoreCase("no")){


                     System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name");
				     System.out.format ("\n\t\t" + "%-10s %8s %8s",  customer[i].getorderNum(),"\t\t" + (customer[i].getpayment() - customer[i].getbalance()),"\t\t\t" + customer[i].getName());
                     clrscr();
                     break;

					 }
				     }
	                else{
				    System.out.println("PLEASE INPUT THE RIGHT ORDER NUMBER!");
				    clrscr();
				    break;
			  }
					}
                   }
                  }

				    if(c == 2){

				    System.out.print("\n\t\t\t\tName: ");
					String nm = scLine.nextLine();

					for(int i=0;i<customer.length;i++){
					clrscr();

			        if(customer[i] instanceof BajuKurung)
				    {
					if(customer[i].getName().equals(nm))
					{

				    if(dv.equalsIgnoreCase("yes")){

                     System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name", "\t\tAddress\n");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer[i].getorderNum(),"\t\t" + ((customer[i].getpayment() - customer[i].getbalance()) + customer[i].getdelivery()),"\t\t\t" + customer[i].getName(),"\t\t\t" + customer[i].getaddress());
                     clrscr();
                     break;
					}

				    else if(dv.equalsIgnoreCase("no")){

                     System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s",  customer[i].getorderNum(),"\t\t" + (customer[i].getpayment() - customer[i].getbalance()),"\t\t\t" + customer[i].getName());
                     clrscr();
                     break;
					}
			      }
	                else{
     			    System.out.println("PLEASE INPUT THE RIGHT NAME!");
				    clrscr();
				    break;
			  }
				 }
	           }
}

                    if(c == 3){

				    System.out.print("\n\t\t\t\tPhone Number: ");
					String pn = scLine.nextLine();

					for(int i=0;i<customer.length;i++){
					clrscr();

					if(customer[i] instanceof BajuKurung)
				    {
					if(customer[i].getphoneNum().equals(pn))
                    {

			        if(dv.equalsIgnoreCase("yes")){
                     System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name", "\t\tAddress\n");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer[i].getorderNum(),"\t\t" + ((customer[i].getpayment() - customer[i].getbalance()) + customer[i].getdelivery()),"\t\t\t" + customer[i].getName(),"\t\t\t" + customer[i].getaddress());
                     clrscr();
                     break;
					}

				    else if(dv.equalsIgnoreCase("no")){

                     System.out.println("\n\t\t" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  "Order Number", "\t\tPrice(RM)", "\t\tCustomer Name");
			         System.out.format ("\n\t\t" + "%-10s %8s %8s %8s",  customer[i].getorderNum(),"\t\t" + (customer[i].getpayment() - customer[i].getbalance()),"\t\t\t" + customer[i].getName());
                     clrscr();
                     break;
                    }
			       }
	                else{
				    System.out.println("PLEASE INPUT THE RIGHT PHONE NUMBER!");
     			    clrscr();
     			    break;
			  }
		          }
                 }

}
}
               else if (ch == 6) {

	           System.out.println("\n\t\t\t\tTHANK YOU FOR USING ME :D");
               break;
			   }


              }


}



	    public static void ChoiceBajumelayu(){
	        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        System.out.println("\n\t\t\t\t1) Baju Melayu Cekak Musang (RM75)");
	        System.out.println("\t\t\t\t2) Baju Melayu Teluk Belanga (RM95)");
	        System.out.print("\n\t\t\t\tPlease put your input here >> ");

	    }

	    public static void ChoiceBajukurung(){
		    System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        System.out.println("\t\t\t\t1) Baju Kurung Normal (RM30)");
	        System.out.println("\t\t\t\t2) Baju Kurung Lining (RM60)");
	        System.out.println("\t\t\t\t3) Baju Kebaya Normal (RM55)");
	        System.out.println("\t\t\t\t4) Baju Kebaya Lining (RM110)");
	        System.out.print("\n\t\t\t\tPlease put your input here >> ");

	    }

	    public static void Choice(){

   	        System.out.println("\t\t\t\tWELCOME TO CINTA SAYANG TAILORING SYSTEM");
   	        System.out.println("\t\t\t\t----------------------------------------");
	        System.out.println("\t\t\t\t1) Baju Melayu");
	        System.out.println("\t\t\t\t2) Baju Kurung");
	        System.out.println("\t\t\t\t3) Find each type Baju Kurung and Baju Melayu sold");
	        System.out.println("\t\t\t\t4) Find maximum order for Baju Melayu and Baju Kurung");
	        System.out.println("\t\t\t\t5) Display customer(s) order detail");
	        System.out.println("\t\t\t\t6) Exit");
	        System.out.print("\n\t\t\t\tPlease put your input here >> ");
	    }

	    public static void displayChoice(){

            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        System.out.println("\t\t\t\t1) Order Number");
	        System.out.println("\t\t\t\t2) Name");
	        System.out.println("\t\t\t\t3) Phone Number");
	        System.out.print("\n\t\t\t\tPlease put your input here >> ");

	    }


	    public static void typechoice(){

            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		    System.out.println("\t\t\t\t1) Search Baju Melayu");
		    System.out.println("\t\t\t\t2) Search Baju Kurung");
		    System.out.print("\n\t\t\t\tPlease put your input here >> ");
	    }

	    public static void exitchoice(){

			System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("THANK YOU FOR USING ME :D");

		}

}