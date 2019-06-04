# jsinterop-simple-example
**Simple Example using GWT JsInterop**

This example uses GWT Boot as Starter Parent: https://github.com/gwtboot/gwt-boot-samples

Take a look at this article to see the whole story: http://bit.ly/WebJavaStory

[![Build Status](https://travis-ci.org/lofidewanto/jsinterop-simple-example.svg?branch=master)](https://travis-ci.org/lofidewanto/jsinterop-simple-example)

To build the example:
```
mvn clean package
```

To run the example:
1. First: run the GWT Dev Mode: 
```
mvn gwt:generate-module gwt:devmode
```
2. Second: open your browser and go to following address:
```
http://127.0.0.1:8888/calculator/
```
3. GWT Dev Mode supports **automatic transpiling**. You just need to update your Java code in your IDE and **reload your web browser**. Your Java code will be automatically transpiled and your webapp stays uptodate without restarting the web server. If you change the **index.html** you need to push the **restart button** on the Swing GUI.