package com.amex.javaexercises

import groovy.json.JsonSlurper
import groovy.json.JsonOutput


//convert json string to object
jsonObject=new JsonSlurper().parseText('{"Name":"RPS","Service":"Training"}')

println "Name=$jsonObject.Name, Service=$jsonObject.Service"

users=new JsonSlurper().parse(new File("users.txt"))

users.each { userEntries->
	//println userEntries
	entries=userEntries.entrySet();
	entries.forEach{
		entry->
		println entry
	}
	
}