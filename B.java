package patienttracker;

import java.io.*;

import java.util.*;

import java.util.Calendar;

public class B{
Calendar calendar = Calendar.getInstance();
int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
Scanner input = new Scanner(System.in);
  Doctor[] d = new Doctor[25];

 Patient[] p = new Patient[200];

 Lab[] l = new Lab[20];
 String months[] = 
	{

   	"Jan",
   	"Feb",
   	"Mar",
   	"Apr",

   	"May",
   	"Jun",
   	"Jul",
   	"Aug",

   	"Sep",
   	"Oct",
   	"Nov",
   	"Dec"  
	};

 static Facility[] f = new Facility[20];

  static Medical[] m = new Medical[100];
 static int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
public B()
{

	

	 int i;

  for (i = 0; i < 25; i++)

   d[i] = new Doctor();

  for (i = 0; i < 100; i++)

   p[i] = new Patient();

  for (i = 0; i < 20; i++)

   l[i] = new Lab();

  for (i = 0; i < 20; i++)

   f[i] = new Facility();

  for (i = 0; i < 100; i++)

   m[i] = new Medical();

  for (i = 0; i < 100; i++)

   s[i] = new Staff();


  d[0].did = "01A";
  d[0].dname = "Dr.Shamik";
  d[0].specilist = "Medicine";
  d[0].appoint = "10-4";
  d[0].doc_qual = "mbbs,Md";
  d[0].droom =8;

  d[1].did = "02A";
  d[1].dname = "Dr.Sayan";
  d[1].specilist = "General";
  d[1].appoint = "10-4";
  d[1].doc_qual = "mbbs,md";
  d[1].droom =5 ;

  d[2].did = "03A";
  d[2].dname = "Dr.Ankan";
  d[2].specilist = "Pedia.";
  d[2].appoint = "10-4";
  d[2].doc_qual = "bdm";
  d[2].droom =3;

  d[3].did = "04A";
  d[3].dname = "Dr.Soham";
  d[3].specilist = "EyeSurgeon";
  d[3].appoint = "10-4";
  d[3].doc_qual = "mbbs,ms";
  d[3].droom =49;


  p[0].pid = "12";
  p[0].pname = "Sanmoy";
  p[0].disease = "Cataract";
  p[0].sex = "male";
  p[0].admit_status = "y";
  p[0].age = 30;
  p[0].adid = "04A";

  p[1].pid = "13";
  p[1].pname = "Rishav";
  p[1].disease = "ViralFever";
  p[1].sex = "male";
  p[1].admit_status = "y";
  p[1].age = 23;
  p[1].adid = "02A";

  p[2].pid = "14";
  p[2].pname = "Nilay";
  p[2].disease = "Dengue    ";
  p[2].sex = "male";
  p[2].admit_status = "y";
  p[2].age = 45;
  p[2].adid = "02A";

  p[3].pid = "15";
  p[3].pname = "Sayanika";
  p[3].disease = "Sugar";
  p[3].sex = "female";
  p[3].admit_status = "y";
  p[3].age = 25;
  p[3].adid = "03A";


  m[0].med_name = "P500";
  m[0].med_comp = "mankind";
  m[0].exp_date = "9-5-22";
  m[0].med_cost = 55;
  m[0].count = 8;

  m[1].med_name = "nytra";
  m[1].med_comp = "acepvt";
  m[1].exp_date = "4-4-20";
  m[1].med_cost = 500;
  m[1].count = 5;

  m[2].med_name = "brufa";
  m[2].med_comp = "reckitt";
  m[2].exp_date = "12-7-21";
  m[2].med_cost = 50;
  m[2].count = 56;

  m[3].med_name = "pride";
  m[3].med_comp = "ddfpvt";
  m[3].exp_date = "12-4-22";
  m[3].med_cost = 1100;
  m[3].count = 100;


  l[0].fecility = "x-ray     ";
  l[0].lab_cost = 800;

  l[1].fecility = "ct scan   ";
  l[1].lab_cost = 1200;

  l[2].fecility = "or scan   ";
  l[2].lab_cost = 500;

  l[3].fecility = "blood bank";
  l[3].lab_cost = 50;


  f[0].fec_name = "ambulane";

  f[1].fec_name = "admit fec";

  f[2].fec_name = "canteen";

  f[3].fec_name = "free camp";


  s[0].sid = "22";
  s[0].sname = "ravi";
  s[0].desg = "worker";
  s[0].sex = "male";
  s[0].salary = 5000;

  s[1].sid = "23";
  s[1].sname = "komal";
  s[1].desg = "nurse";
  s[1].sex = "female";
  s[1].salary = 2000;

  s[2].sid = "24";
  s[2].sname = "raju";
  s[2].desg = "worker";
  s[2].sex = "male";
  s[2].salary = 5000;

  s[3].sid = "25";
  s[3].sname = "rani";
  s[3].desg = "nurse";
  s[3].sex = "female";
  s[3].salary = 20000;
}

  Staff[] s = new Staff[100];
public void doc()
{

  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");

   


  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **DOCTOR MODULE**");

      System.out.println("--------------------------------------------------------------------------------");

     int  s1 = 1;

      while (s1 == 1)

      {

       System.out.println("1.new entry\n2.doctor list");

      int c1 = input.nextInt();

       switch (c1)

       {

        case 1:

         {

          d[count1].new_doctor();
	count1++;

          break;

         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name\t\t specilist \t timing \t qualification \t room no");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count1; j++)       
        	   d[j].doctor_info();
     
          break;

         }

       }



       System.out.println("PRESS 1 TO CONTUINUE ON SAME MODULE \nPRESS 0 TO GO BACK TO CHANGE MODULE");

       s1 = input.nextInt();

      }

}

public void pat()
{


  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");

   

  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                     **PATIENT MODULE**");

      System.out.println("--------------------------------------------------------------------------------");

      s2 = 1;

      while (s2 == 1)

      {

       System.out.println("1.new entry\n2.patient list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          p[count2].new_patient();count2++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id\tname\tdisease\t\tsex\tadmit_status\tage\tassigneddoctorid");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count2; j++) {
           p[j].patient_info();
          }
          break;
         }

       }

       System.out.println("PRESS 1 TO CONTUINUE ON SAME MODULE \nPRESS 0 TO GO BACK TO CHANGE MODULE");

       s2 = input.nextInt();

      }

}

public void lb()
{

  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");
   


  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
s4 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                    **LABORATRY MODULE**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s4 == 1)

      {

       System.out.println("1.new entry \n2.lab list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          l[count4].new_feci();count4++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("fecility\t\tcost");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count4; j++) {
           l[j].feci_list();

          }

          break;

         }

       }

       System.out.println("PRESS 1 TO CONTUINUE ON SAME MODULE \nPRESS 0 TO GO BACK TO CHANGE MODULE");

       s4 = input.nextInt();

      }
}

public void med()
{
	
 

  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");

   


  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
s3 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                     **MEDICAL MODULE**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s3 == 1)

      {

       System.out.println("1.new entry\n2.medicine list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          m[count3].new_medi();count3++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("name \t company \t expiry date \t cost \t Quantity");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count3; j++) {
           m[j].find_medi();
          }        
  break;
         }

       }

       System.out.println("PRESS 1 TO CONTUINUE ON SAME MODULE \nPRESS 0 TO GO BACK TO CHANGE MODULE");

       s3 = input.nextInt();

      }
}
public void fac()
{

  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");

   


  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
s5 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("          **HOSPILITY FACILITY MODULE**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s5 == 1)

      {

       System.out.println("1.new entry\n2.facility list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          f[count5].add_feci();count5++;
          break;
         }

        case 2:
         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("hospility facility are:-");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count5; j++) {
           f[j].show_feci();
          }
          break;
         }

       }

       System.out.println("PRESS 1 TO CONTUINUE ON SAME MODULE \nPRESS 0 TO GO BACK TO CHANGE MODULE");

       s5 = input.nextInt();

      }

}
public void stf()
{

  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");



  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
 s6 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                       **STAFF MODULE**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s6 == 1)

      {


       String a = "nurse", b = "worker", c = "security";

       System.out.println("1.new entry\n2.nurse list\n3.worker list \n4.securuty list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          s[count6].new_staff();count6++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");


          System.out.println("id \t name \t sex \t salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (a.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

        case 3:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name \t sex \t salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (b.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

        case 4:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name \t sex \t salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (c.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

       }

       System.out.println("PRESS 1 TO CONTUINUE ON SAME MODULE \nPRESS 0 TO GO BACK TO CHANGE MODULE");

       s6 = input.nextInt();

      }
}

public void cons()

 {

   int instatus=1;
  

  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");



  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
 while (instatus == 1)

  {

   System.out.println("\n                                    MAIN MENU");

   System.out.println("--------------------------------------------------------------------------------");
   
   System.out.println("\n                               SYSTEM MODULE LISTING");

   System.out.println("--------------------------------------------------------------------------------");

   System.out.println("1.DOCTOR  2. PATIENT  3.MEDICAL  4.LAB  5. FACILITY  6.STAFF 7.EXIT");

   System.out.println("--------------------------------------------------------------------------------");


   choice = input.nextInt();

   switch (choice)

   {

    case 1:

     {
	doc();
      break;

     }

    case 2:

     {
	pat();
      break;

     }

    case 3:

     {
med();
      
      break;

     }

    case 4:

     {
lb();
      break;

     }

    case 5:

     {
fac();
      break;

     }

    case 6:

     {
stf();
      break;

     }

    case 7:

     {

      break;

     }

    default:

     {

      System.out.println("entered wrong choice!");

     }

   }

   System.out.println("PRESS 1 TO GO TO MAIN MENU \nPRESS 0 TO EXIT");

   instatus = input.nextInt();

  }

 }

    public void writeIntoFile()
{   
	
  System.out.println("--------------------------------------------------------------------------------");
  System.out.println("                          ***STARK INDUSTRIES***");



  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          ***PATIENT MANAGEMENT SYSTEM***");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

 try{  

        FileWriter fw1=new FileWriter("TXTFILE\\doctor.txt");    
	for(int fi=0; fi<count1 ;fi++)

	{
        fw1.write(d[fi].did);
	fw1.write("	 ");
	fw1.write( d[fi].dname);
	fw1.write ( " 	");
	fw1.write(d[fi].specilist);
	fw1.write ( " 	" );
	fw1.write (d[fi].appoint);
	fw1.write ( " 	" );
	fw1.write (d[fi].doc_qual);
	fw1.write ( " 	" );
	fw1.write (d[fi].droom);
	fw1.write(System.getProperty( "line.separator" ));
	}
        fw1.close();  
  
	FileWriter fw2=new FileWriter("TXTFILE\\patient.txt");
	for(int fi=0; fi<count3 ;fi++)

	{
        fw2.write(p[fi].pid);
	fw2.write(" 	");
	fw2.write( p[fi].pname);
	fw2.write ( " 	");
	fw2.write(p[fi].disease);
	fw2.write ( " 	" );
	fw2.write (p[fi].sex);
	fw2.write ( " 	" );
	fw2.write (p[fi].admit_status);
	fw2.write ( " " );
	fw2.write (p[fi].age);
	fw2.write ( " 	" );
	fw2.write (p[fi].adid);
	fw2.write(System.getProperty( "line.separator" ));
	}
        fw2.close();
	
	FileWriter fw3=new FileWriter("TXTFILE\\medicine.txt");
	for(int fi=0; fi<count3 ;fi++)

	{
        fw3.write(m[fi].med_name);
	fw3.write(" 	");
	fw3.write(m[fi].med_comp);
	fw3.write ( " 	");
	fw3.write(m[fi].exp_date);
	fw3.write ( " 	" );
	fw3.write (m[fi].med_cost);
	fw3.write ( "	 " );
	fw3.write (m[fi].count);
	fw3.write(System.getProperty( "line.separator" ));
	}
        fw3.close();

	FileWriter fw4=new FileWriter("TXTFILE\\lab.txt");
	for(int fi=0; fi<count4 ;fi++)

	{
        fw4.write(l[fi].fecility);
	fw4.write(" 	");
	fw4.write(l[fi].lab_cost);
	fw4.write(System.getProperty( "line.separator" ));
	}
        fw4.close();	
	
	FileWriter fw5=new FileWriter("TXTFILE\\facility.txt");
	for(int fi=0; fi<count5 ;fi++)

	{
        fw5.write(f[fi].fec_name);
	fw5.write(System.getProperty( "line.separator" ));
	}
        fw5.close();

	FileWriter fw6=new FileWriter("TXTFILE\\staff.txt");
	for(int fi=0; fi<count6 ;fi++)

	{
        fw6.write(s[fi].sid);
	fw6.write("	");
	fw6.write(s[fi].sname);
	fw6.write ("	");
	fw6.write(s[fi].desg);
	fw6.write ("	" );
	fw6.write (s[fi].sex);
	fw6.write ("	 " );
	fw6.write (s[fi].salary);
	fw6.write(System.getProperty( "line.separator" ));
	}
        fw6.close();

     }catch(Exception e){System.out.println(e);} 
	System.out.println("WRITTEN IN FILE");
}
}
