package com.amex.javaexercises

println "Enter no of users"
int count=Integer.parseInt(System.in.newReader().readLine());
println "$count"

users=new String[count];
for(int i=0;i<count;i++) {
	users[i]="user"+new Random().nextInt(1000);
}

//print them
for(String data in users) {
	println "$data"
}