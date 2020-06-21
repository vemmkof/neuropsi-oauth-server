#!/bin/bash
appname="arcane-depths-42325"
heroku deploy:jar target/neuropsi-oauth-server-0.0.1-SNAPSHOT.jar --app $appname
