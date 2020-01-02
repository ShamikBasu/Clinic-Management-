package patienttracker;

import java.io.*;

import java.util.*;

import java.util.Calendar;



public class Doctor

{

 public String did, dname, specilist, appoint, doc_qual;

 public int droom;



 public void new_doctor()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("id:-");
  did = input.nextLine();

  System.out.print("name:-");
  dname = input.nextLine();

  System.out.print("specilization:-");
  specilist = input.nextLine();

  System.out.print("work time:-");
  appoint = input.nextLine();

  System.out.print("qualification:-");
  doc_qual = input.nextLine();

  System.out.print("room no.:-");
  droom = input.nextInt();

 }

 public void doctor_info()

 {

  System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);


 }

}
