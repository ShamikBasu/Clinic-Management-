package patienttracker;

import java.io.*;

import java.util.*;

import java.util.Calendar;

public class Facility

{



 public String fec_name;

 public void add_feci()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("fecility:-");
  fec_name = input.nextLine();


 }

 public void show_feci()

 {

  System.out.println(fec_name);

 }

}
