package com.amex.javaexercises

import groovy.json.JsonSlurper


//convert json string to object
jsonObject=new JsonSlurper().parseText('{"Name":"RPS","Service":"Training"}')

println "Name=$jsonObject.Name, Service=$jsonObject.Service"