#!/bin/bash
java --enable-preview --module-path ./menuconsumer/target/classes:menuprovider/target/classes:menuservice/target/classes -m org.example.menuconsumer/org.example.menuconsumer.consumer.ServiceMenuConsumer
