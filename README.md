# Spring-MicroServices

To start your Phoenix server:

  * Just run the main method of each service i.e. Album and User microservices.

Now you can visit [`localhost:8080`](http://localhost:8080) from your browser for User and (http://localhost:8081) for Album Microservice respectively.


## API End Point
User Microservicer has 2 end points:
To access getUser on basis of id we need to send get request to http://localhost:8080/api/v1/user/getUser/ with param:
id = 1 
Or http://localhost:8080/api/v1/user/getUser/?id=1 

Similarly album microservice has 2 end points getAlbums and getAlbum(on basis of id)
To access it we can send a get request to http://localhost:8081/api/v1/album/getAllAlbums/

## Database used
mySql server has been used, you can check it's configurations in application.yml and update to your respective DB path.
      
