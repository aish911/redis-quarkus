[# redis-quarkus](https://quarkus.io/guides/redis-reference)

If connecting with azure redis :

quarkus:
  redis:
    hosts: rediss://host:port
    password: pwd
    ssl:
      hostname-verification: DEFAULT
    tls:
      enabled: true
