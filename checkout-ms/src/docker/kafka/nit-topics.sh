docker exec -t broker kafka-topics --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic streaming.ecommerce.checkout.created --if-not-exists
docker exec -t broker kafka-topics --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic streaming.ecommerce.payment.paid --if-not-exists
