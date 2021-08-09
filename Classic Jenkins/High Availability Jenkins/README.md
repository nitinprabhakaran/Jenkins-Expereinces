## SETTING UP HAPROXY FOR JENKINS SERVER FARM

This Configuration was done for Jenkins Master Nodes, so that both master can be used, if one of them is dead, jobs HAProxy will push jobs to the other Jenkins Master

add below as Front End and Back Edn definitions apart from the defaults

### Frontend Pool Defintion

```
frontend ha_jenkins_endpoint
    bind *:80
    default_backend jenkins_master_backend
    reqadd X-Forwarded-Proto:\ http
```

### Backend Pool Definition

```
backend jenkins_masters_backend
    server jenkinsmaster1 172.31.83.182:8080 check
    server jenkinsmaster2 172.31.93.93:8080 check backup
```