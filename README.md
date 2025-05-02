# Welcome To SPI Project
### Password Generator

This is a school project that explores the SPI architecture and design. 

## Requirements
* Java 24
* Apache Maven 3.9.9 set to Java version: 24
* Docker version 28.0.4, build b8034c0 > greater
* PowerShell 7.5.1 > greater

## Supports
Linux, MacOSx, [Windows](#windows-steps-to-run-application)

## Getting started
All described steps assume that you have access to a terminal with a posix system or similar to it. 

#### Step 0
Git clone repository with the command below:
```shell
git clone https://github.com/efpcode/spi-project.git
```
#### Step 1
Navigate to the root project with ``cd`` command and name of repository ``spi-project``:
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

# Windows Steps to Run Application
* Easy just run the same commands as above but with [wsl](https://learn.microsoft.com/en-us/windows/wsl/install).

## Running locally with Powershell

#### Step 0
Start by cloning the project as described for Steps 0 to Step 1 in a Powershell terminal window.

#### Step 1
Run the following command in Powershell, to compile the project with maven and create the ``libs`` directory for storing the ``*.jar`` files. 
```powershell
./setup
```


#### Step 2
Execute application by entering the following command:
```powershell
./run
```

## Running Docker Locally

First time running the docker the ``run_docker.ps1`` file it should be run with ``-c`` flag to compile
maven projects. 

#### Initial Run
Run the following command to ensure that project is complied with maven before creating image: 
```powershell
./run_docker -c
```

#### Run After Initial Command
This command should only be run if the ``Initial Run`` step has been performed.

```powershell
./run_docker
```

# Troubleshoot with Docker

1. Ensure that Docker Desktop or similar application is running before running any of ``run_docker``
2. Ensure that image called ``my-java-app:latest`` is removed and re-run the script for respective platform with the ``Initial Run`` description.  

# Lastly 
## Thank you for the read :-)
