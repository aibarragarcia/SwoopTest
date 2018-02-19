# SwoopTest


The service was built using the following technologies:

  Spring Boot
  Gradlew (build)
  Git (source control)

For the endpoint number 3: GET : http://<server_url>/time/now 
I was not able to get a valid key.
The implementation to call the external service was coded and I used a dummy key.
Of course the response is an invalid authentication.

For endpoints 1 and 2 I'm using the explicit declaration of RequestMethod.GET, RequestMethod.POST to restrict other methods.
And I'm using the same method, because the requirement is the same "add numbers 1 and 2 and provide the result in JSON"
Just 2 different HTTP methods.
We can if we want to by pass the method declaration GET vs. PUT, POST, and so forth, because @RequestMapping maps all HTTP operations by default

I did not use AWS simply because I did not want to sign up simply for a coding exercise.
the service can be run using the following instructions.
Please run the service using the jar provided:
  java -jar build/libs/gs-rest-service-0.1.0.jar


GET requests:
  GET requests can be cached
  GET requests remain in the browser history
  GET requests can be bookmarked
  GET requests should never be used when dealing with sensitive data
  GET requests have length restrictions
  GET requests should be used only to retrieve data
  GET requests can be cached
  GET requests parameters remain in browser history
  GET requests data is visible to everyone in the URL	
  GET requests is less secure compared to POST because data sent is part of the URL

POST requests:
  POST requests are never cached
  POST requests do not remain in the browser history
  POST requests cannot be bookmarked
  POST requests have no restrictions on data length
  POST requests can't be cached
  POSTrequests parameters don't remain in browser history
  POSTrequests BACK button/Reload data will be re-submitted (the browser should alert the user that the data are about to be                  re-submitted)
  POSTrequests data is not displayed in the URL
  
  

