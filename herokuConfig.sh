#!/bin/bash
appname="arcane-depths-42325"
username="neuropsi"
password="0e4e034f3504195e386b1bdcf4fbfe78"
hotsname="$appname.herokuapp.com"
eureka_instance="infinite-crag-20939.herokuapp.com"
eureka="https://$username:$password@$eureka_instance"
heroku config:set USERNAME=$username --app $appname
heroku config:set PASSWORD=$password --app $appname
heroku config:set PROFILE=prod --app $appname
heroku config:set HOSTNAME=$hotsname --app $appname
heroku config:set EUREKA_URL=$eureka --app $appname
