#!/bin/bash
# java --enable-preview --module-path ./application/target/classes:./menuconsumer/target/classes:./menuprovider/target/classes:./menuservice/target/classes -m org.example.application/org.example.application.run.Main
java --enable-preview --module-path ./libs -m org.example.application/org.example.application.run.Main
