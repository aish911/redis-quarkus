[# redis-quarkus](https://quarkus.io/guides/redis-reference)

https://quarkus.io/guides/redis

If connecting with azure redis :

quarkus:
  redis:
    hosts: rediss://host:port
    password: pwd
    ssl:
      hostname-verification: DEFAULT
    tls:
      enabled: true
