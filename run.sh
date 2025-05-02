#!/bin/sh
echo "Running application"
exec java --enable-preview --module-path ./libs -m org.example.application/org.example.application.run.Main
