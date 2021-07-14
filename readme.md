# Example Eclipse 4 RCP App build with Tycho

![build](https://github.com/confinitum/e4-rcp-tycho/actions/workflows/maven.yml/badge.svg)

## Setup
1. Eclipse 21.06 RCP with e4 Tools installed
1. Maven.   
This project was created and tested with maven 3.6.1.  
Optionally you can use docker by invoking mvnOnDocker.cmd on windows
2. Basic RCP App:  

    * e.app - Application plugin
    * e.feature - feature definition 
    * e.product - product definition, feature based
    * target-platform - target platform

## Usage

1. clone repo
2. run `mvn clean verify` in root of the cloned repository
    1. you must use either most recent or a LTS java version (e.g. Java 11)
    2. if you have docker installed use `mvnOnDocker.cmd` on windows

3. you will find the product in `./example.product/target/products`  
unzip and run eclipse.exe

## Notes
This is  tycho pomless build, which means there is only one mandatory `pom.xml` in project root and an additional `extensions.xml` in `.mvn` folder. 

Features and target platform seem also to be mandatory for a working tycho build.

