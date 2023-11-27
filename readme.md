## Docker 
### start elastic
'docker run -d \
--name es-container \
--net es-net \
-p 9200:9200 \
-e xpack.security.enabled=false \
-e discovery.type=single-node \
-e ELASTIC_USERNAME=elastic \
-e ELASTIC_PASSWORD=123123 \
-m 1GB \
docker.elastic.co/elasticsearch/elasticsearch:7.17.3'

### start kibana
'docker run -d \
--name kb-container \
--net es-net \
-p 5601:5601 \
-e ELASTICSEARCH_HOSTS=http://es-container:9200 \
docker.elastic.co/kibana/kibana:7.17.3



