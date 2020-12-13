# run all docker copmose files: cd directory to docs folder and run following command on CL
docker-compose -f docker-compose.yml up -d

# kill all docker images
docker kill $(docker ps -aq)
