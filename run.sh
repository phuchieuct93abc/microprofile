docker stop service-a && docker stop service-b && docker container prune
docker run -d --name service-a  -p 9080:9080 -p 9443:9443 --net service service-a
docker run -d --name service-b  -p 9081:9081 -p 9444:9444 --net service --link service-a service-b