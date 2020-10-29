#!/bin/bash


API_PREV_VERSION=$(rpm -q arjun-app | xargs)
echo "${API_PREV_VERSION}" > /tmp/arjun-app-prev
