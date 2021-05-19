# neueda-test

Build
```shell script
mvn clean install
```

Run unit tests
```shell script
mvn verify -DskipUTs=false
```

Run integration tests
```shell script
mvn verify -DskipITs=false
```

Run application
```shell script
cd neueda-test-bootapp
mvn clean package spring-boot:repackage
java -jar target/neueda-test-bootapp-1.0.0-SNAPSHOT.jar
```

Save URL
```shell script
curl -X POST -H "Content-Type: text/plain" --data "https://www.google.com/search?q=top+books+you+should+read+in+your+lifetime&oq=top+books+you+should&aqs=chrome.1.0l2j69i57j0l2j0i22i30l5.6176j0j7&sourceid=chrome&ie=UTF-8" http://localhost:8080/
```

Open a browser and paste http://localhost:8080/{id}, replacing {id} with the response from the previous request