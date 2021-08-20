package com.amex.javaexercises

println "Enter no of users"
count=Integer.parseInt(System.in.newReader().readLine());
println "$count"

users=new String[count];
for(int i=0;i<count;i++) {
	users[i]="user"+new Random().nextInt(1000);
}

//print them
for(String data in users) {
	println "$data"
}

//list
customerData=[['name':'Ashok1'],['name':'Sumanth'],['name':'Zia']];
customerData.forEach{
	x->
	entries=x.entrySet();
	entries.forEach{
		entry->
			println entry.key+","+entry.value;
		
	}
}



