#!/bin/sh
echo "Running application"
exec java --module-path ./libs -m org.example.application/org.example.application.run.Main
