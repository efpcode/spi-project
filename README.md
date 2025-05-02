# Welcome To SPI Project
### Password Generator

This is a school project that explores the SPI architecture and design. 

## Requirements
* Java 24
* Apache Maven 3.9.9 set to Java version: 24
* Docker version 28.0.4, build b8034c0 > greater

## Getting started
All described steps assume that you have access to a terminal with a posix system or similar to it. 

#### Step 0
Clone repository with the command below:
```shell
git clone https://github.com/efpcode/spi-project.git
```
#### Step 1
Navigate to the root project with cd command and name of repository ``spi-project``:
```shell
cd spi-project
```
#### Step 2
Make the ".sh" files executable with the following command:
```shell
 chmod +x run_docker.sh run.sh setup.sh
```

## Running the App Locally
To run the application locally please enter the following commands:
1. Compiles step and moves modules to libs directory.
```shell
./setup.sh
```
2. Executes application module.
```shell
./run.sh
```

## Run with Docker
The first time the application needs to be compiled to have the needed .jar files.

#### Initial Step
```shell
./run_docker.sh -c
```

The command above is optional with the c -flag (compile) after it has been run once.

#### After Initial Step
```shell
./run_docker.sh
```

The command above will load the docker file and will build a container in interactive mode with name called ``my-java-app``.

# Lastly 
## Thank you for the read :-)
