#!/bin/bash
if [ $# -gt 0 ]; then
    GFDIR=$1
    echo "Adding user 'brooklynbrawler' to group 'workers'..."
    $GFDIR/bin/asadmin create-file-user --groups workers brooklynbrawler
    echo "Adding user 'paulheymann' to group 'bookers'..."
    $GFDIR/bin/asadmin create-file-user --groups bookers paulheymann
    exit 0
else
    echo "ERROR! Must supply path to Glassfish-directory as parameter!"
    echo "Example: ./user-setup.sh /usr/local/glassfish4"
    exit 1
fi

