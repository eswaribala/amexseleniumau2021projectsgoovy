package com.amex.javaexercises

//test Gstring....

println """This is to demo gstring with

dual line"""


//data type checking
firstName="Parameswari"
age=51
active=true

println firstName.class.name

println age.class.name

println active.class.name

//to print the variables

println "First Name = $firstName"

println "Age = $age"

println "Active = $active"
import java.time.LocalDate
dateOfTravel= LocalDate.now();
println "$dateOfTravel"
day=dateOfTravel.getDayOfMonth();
println "$day"

//flexi dates for travel
//after a week from the planned date
use (groovy.time.TimeCategory) {
  println new Date()
  println 10.weeks.from.now
}

//reading the date
pattern = "yyyy-MM-dd"
println "Enter Date of Travel"
dateOfTravel= System.in.newReader().readLine();
import java.text.SimpleDateFormat
//string to date
formattedDate = new SimpleDateFormat(pattern).parse(dateOfTravel)

println "Date of Travel = $formattedDate"


import java.util.GregorianCalendar as D
import static java.util.Calendar.getInstance as now

dob=new D(1970,11,2).time
println "$dob"

import java.text.SimpleDateFormat
import java.util.GregorianCalendar as D
import static java.util.Calendar.getInstance as now
import groovy.time.TimeCategory
dateOfTravel= new D(2021,6,15).time
println "$dateOfTravel"

//flexi dates for travel
//after a week from the planned date
use (groovy.time.TimeCategory) {
  println new Date()
  println 10.weeks.from.now
}


//Date parsing

pattern = "yyyy-MM-dd"
println "Enter Date of Travel"
dateOfTravel= System.in.newReader().readLine();

//string to date
formattedDate = new SimpleDateFormat(pattern).parse(dateOfTravel)

println "Date of Travel = $formattedDate"
