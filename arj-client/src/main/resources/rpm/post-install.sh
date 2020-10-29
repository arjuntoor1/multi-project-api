#!/bin/bash

PREVIOUS_VERSION=$(cat /tmp/arjun-app-prev | tail -1 | xargs) # piping to xargs trims whitespace
CURRENT_VERSION=$(rpm -q arjun-app | tail -1 | xargs)

function is_from() {
  [[ "$1" == "${PREVIOUS_VERSION}" ]]
}
function is_to() {
  [[ "$1" == "${CURRENT_VERSION}" ]]
}
function is_from_and_to() {
  local from=$1
  local to=$2
  is_from "${from}" && is_to "${to}"
}
# ---------------------------------


# ---------------------------------

if is_to "arjun-app-2-1.noarch"; then
  echo "Hooray! Script will be applied here (${PREVIOUS_VERSION} --> ${CURRENT_VERSION})"
else
  echo "Script will NOT be applied (${PREVIOUS_VERSION} --> ${CURRENT_VERSION})"
fi





# ----------------------------------
