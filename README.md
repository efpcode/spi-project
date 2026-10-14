# Welcome To SPI Project
### Password Generator

This is a school project that explores the Service Provider Interface (*SPI*) architecture and design. 

## Requirements
* JDK 25
* Apache Maven 3.10.0
* POSIX-compatible shell (Linux, macOS, or WSL)
* Docker
* PowerShell 7.5.1 > or newer when using the Windows scripts

## Supports
* Linux, macOS, [Windows](#windows-steps-to-run-application)
* AMD64 and ARM64

## Run the Published Docker Image
This project has been published as an image on Docker Hub and supports Linux containers on AMD64 and ARM64.

> Docker is required to run steps below. 

1. Pull the image from Docker Hub:
```shell
 docker pull efpcode/spi-demo:latest
```

2. Run image with the following command:
```shell
docker run --rm -it efpcode/spi-demo:latest
```


## Getting Started Locally 

The described steps requires access to a terminal with a POSIX-compatible shell (`/bin/sh`) or similar to it. 

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
1. Compile the modules and copies their JAR file to the `libs` directory.
```shell
./setup.sh
```
2. Executes application module.
```shell
./run.sh
```

## Run with Docker
The first time the application needs to be compiled to have the needed .jar files.
The Dockerfile uses a hardened image from `dhi.io` and if authentication fails run *Authentication Step* before *Initial Step*.

#### Authentication Step
```shell
docker login dhi.io
```

#### Initial Step
```shell
./run_docker.sh -c
```

The command above is optional with the c -flag (compile) after it has been run once.

#### After Initial Step
```shell
./run_docker.sh
```

The script reuses `my-java-app:latest` if it exists. If it does not exist, the script builds the image before starting a temporary interactive container.

# Windows Steps to Run Application
* Easy just run the same commands as above but with [wsl](https://learn.microsoft.com/en-us/windows/wsl/install).

## Running locally with Powershell

#### Step 0
Start by cloning the project as described for Steps 0 to Step 1 in a Powershell terminal window.

#### Step 1
Run the following command in Powershell, to compile the project with Maven and create the ``libs`` directory for storing the ``*.jar`` files. 
```powershell
.\setup.ps1
```


#### Step 2
Execute application by entering the following command:
```powershell
.\run.ps1
```

## Running Docker Locally

When running the ``run_docker.ps1`` file it should be run with ``-c`` flag to compile
Maven modules. 

#### Initial Run
Run the following command to ensure that project is compiled with maven before creating image: 
```powershell
.\run_docker.ps1 -c
```

#### Run After Initial Command
This command should only be run if the ``Initial Run`` step has been performed.

```powershell
.\run_docker.ps1
```

# Troubleshoot with Docker

1. Ensure that Docker Desktop or similar application is running before running any of ``run_docker`` files.
2. For rebuild or change in source code locally, ensure that image called ``my-java-app:latest`` is removed and re-run the appropriate `run_docker` script with the `-c` flag.  

# Lastly 
## Thank you for the read :-)
