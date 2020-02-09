# Package
Run package.sh to build the application into self-executable project
Output: service-a/target/demo.jar,service-b/target/demo.jar
# Build
run build.sh to build docker image base on the jar files which are generated before
# Run docker-compose
run compose.sh to start docker-compose which run both image service-a and service-b
# Test
Open web browser and access http://localhost:9080/ to check the result