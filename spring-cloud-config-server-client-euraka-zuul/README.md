#microservices
 cart-service
 customer-service
#Service Discovery
 Eureka Server
#API Gateway
 Zuul API Gateway
 
#Working
 customer-service gives API call to cart-service request is intercept by API Gateway to get list of product in a customer cart.
 localhost:8081/getCustomerCartDetails/{cu1}
 
#Execution
 make sure Eureka server is up and running.

 run all the microservices in any order
  cart-service
  customer-service
  zuul-api-gateway-server
 
 Go to rest client type the following url
    * Eureka server
	http://localhost:8761/
	* Get product list
    http://localhost:8761

    localhost:8765/customer-service/getCustomerCartDetails/cu1
	
      




 
