# RC_Dock_Java

Configuration and Execution of Trincentis Web Site automation

- [Setup](#setup)
  - [JDK](#jdk)
  - [Eclipse](#eclipse)
  - [Cucumber](#cucumber)
  - [Libraries](#libraries)
- [Execution](#execution)
- [References](#references)

## Setup

### <u>JDK</u>

The Java Development Kit (JDK) is a development environment to work with Java programming language and we will use it as our main language for the automated tests.

The first step of our setup is to [download the JDK](#https://www.oracle.com/java/technologies/downloads/).

After download the .exe file, click on installer to start the installation. After installation starts, you can just click on “Next” and proceed with your preferred path for Java.

After the installation you can click on “Next Steps” to see more about the JDK documentation, if you don’t want to see it now, just click on “Close”.


### <u>Eclipse</u>

After having the JDK as our development environment to work with Java, its good to have an IDE for this language, so we will use Eclipse IDE on this project. 
You can download the newest version of Eclipse IDE at http://www.eclipse.org/downloads/.

After download the .exe file, click on installer to start the installation. After installation starts, the installer will ask the propose you want to use the Eclipse and you can choose the first option “Eclipse IDE for Java Developers”.

Then you can install the IDE in your preferred path. When the installation finishes, click to launch Eclipse.

The IDE launcher will ask to create a workspace and you can create wherever you want, this path is just to IDE knows where to find your preferences on launches.


#### Import Project

After we have the Eclipse, we need to get the project from GitHub to still with installation:

Go to project path: https://github.com/RuanExposito/RC_Dock_Java and clone the project in the directory that you chose the workspace for Eclipse.

Inside the Eclipse, choose import option (<b><u><i>File</i></u></b> -> <b><u><i>Import</i></u></b>).

Then choose <b><u><i>General</i></u></b> -> <b><u><i>Existing Projects into Workspace</i></u></b> and click in “Next”.

Finally, choose the path of the project that you cloned on workspace and click to select the project, then you click to finish and the project will already be on Project/Package Explorer.


### <u>Cucumber</u>

Cucumber is a framework to do our automated tests writing the files with behavior-driver development (BDD). We will use Cucumber to make the automation easer to understand and develop. To configure the Cucumber, we open Eclipse and go to <b><u><i>Help</i></u></b> -> <b><u><i>Eclipse Marketplace…</i></u></b>, search for Cucumber on marketplace and install Cucumber plugin.

### <u>Chromedriver</u>

Chromedriver is needed for the web tests on Google Chrome with Selenium, so we must download the version of our browser.

First you need to [download the Chromedriver](#https://sites.google.com/chromium.org/driver/downloads), then just insert the file on root folder of the project.

### <u>Libraries</u>

Verify if you have all the Libraries that we need on the project. Look at the left on Project Explorer inside the Eclipse, if you have the items "JRE System Library", "Maven Dependencies" and "Referenced Libraries", the project is all set.

If you don't have one of them, do a <b><u><i>right click on project</i></u></b> -> <b><u><i>Maven</i></u></b> -> <b><u><i>Update project...</i></u></b>. With this command, the dependencies of "pom.xml" file will be added to the project and, if you still without the "Referenced Libraries", you must [download Selenium Grid](#https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.1.0/selenium-server-4.1.1.jar) and add it at you project.

To add the .jar file of Selenium on the project, you go to <b><u><i>Project</i></u></b> -> <b><u><i>Properties</i></u></b> -> <b><u><i>Java Build Path</i></u></b> -> <b><u><i>Add External JARs...</i></u></b> and select the path for the .jar file that you downloaded.

---

## Execution

To execute the project, you must have it already imported on the Eclipse and <b><u><i>right click the file "src/test/java/stepDefinitions/TestRunner.java"</i></u></b> -> <b><u><i>select "Run As"</i></u></b> -> <b><u><i>select "JUnit Test"</i></u></b>.

---

## References

The references are for more information and for material used as reference for this project.

Automated website link:
[http://sampleapp.tricentis.com/101/app.php](#http://sampleapp.tricentis.com/101/app.php)

Interesting guides for the project:

- [Guide from BrowserStack](#https://www.browserstack.com/guide/how-to-setup-selenium-in-eclipse)
- [Guide from ToolsQA](#https://www.toolsqa.com/selenium-webdriver/configure-selenium-webdriver-with-eclipse/)
- [Guide from Guru99](#https://www.guru99.com/installing-selenium-webdriver.html)
- [Guide from Edureka](#https://www.edureka.co/blog/selenium-installation/)
- [Guide from JavTPoint](#https://www.javatpoint.com/selenium-webdriver-running-test-on-chrome-browser)

---

Youtube vídeos for configuration:

- [Naveen AutomationLabs - Cucumber with Java](#https://www.youtube.com/watch?v=t54-83glFaM)
- [Automation Step by Step - Selenium Cucumber Java BDD Framework 1 - Setup](#https://www.youtube.com/watch?v=4e9vhX7ZuCw)
- [Automation Step by Step - Selenium Cucumber Java BDD Framework 9 - Hooks](#https://www.youtube.com/watch?v=iBum6hUgxgg)
- [Software Testing Mentor - How to Setup Selenium WebDriver in Eclipse IDE](#https://www.youtube.com/watch?v=FVwSjBXb20o)

---

Software documentations:

- [Cucumber](#https://cucumber.io/docs/guides/browser-automation/)
- [Cucumber-Java-Skeleton](#https://github.com/cucumber/cucumber-java-skeleton)
- [Selenium](#https://www.selenium.dev/documentation/overview/)
- [JDK definitions](#https://www.oracle.com/java/technologies/javase/jdk-jdk-7-readme.html)
