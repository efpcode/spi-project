#!/bin/bash
java --enable-preview --module-path ~/.m2/repository/org/jetbrains/annotations/24.0.1/annotations-24.0.1.jar:menuconsumer/target/classes:menuprovider/target/classes:menuservice/target/classes -m org.example.menuconsumer/org.example.menuconsumer.consumer.ServiceMenuConsumer
