# Quickstart Guide #
  1. Create a new Android project. A Hello World example how to create a new Android project is described here: http://developer.android.com/resources/tutorials/hello-world.html
  1. Create a new model file
    1. Right Click on the Android project and click New -> other<br />![http://www.fg85.de/acp/007.png](http://www.fg85.de/acp/007.png)<br />
    1. Select **Android Content Provider Model** inside the Android folder.<br />![http://www.fg85.de/acp/008.png](http://www.fg85.de/acp/008.png)<br />
    1. Select a container (your current Android project) and a model filename (model filename should be end with .ecore) <br />![http://www.fg85.de/acp/009.png](http://www.fg85.de/acp/009.png)<br />
    1. A folder **model** and two files are created inside your Android project.<br />![http://www.fg85.de/acp/010.png](http://www.fg85.de/acp/010.png)<br />Both files can be used to develop your domain model. With the **ecorediag** file you can draw a domain model with a graphical editor. The **ecore** file represents only the xml structure of your model, but you can develop your domain model here too.<br />
  1. Create your first domain model with the graphical editor. In this example you create only a very simple domain model with a datatype called People which has two attributes name and surname.<br />Open the ecorediag file and create your domain model. Create a class and call it **People**. Add two attributes **name** and **surname** from the type **EString**. Remember: You can only use the specific ecore datatypes which are the same like the simple datatypes from Java. Only with a prefix letter: E.<br />![http://www.fg85.de/acp/011.png](http://www.fg85.de/acp/011.png)<br />Save your model now.<br />
  1. Open the ecore file and see what is happend.<br />![http://www.fg85.de/acp/013.png](http://www.fg85.de/acp/013.png)<br />The ecore file represents your model in xml. Now right click the ecore file and click **Android Tools -> Generate Android Content Provider** The content provider will be generated with your model.<br />![http://www.fg85.de/acp/014.png](http://www.fg85.de/acp/014.png)<br />
  1. Now the Android Content Provider classes are generated into the
**src-gen** folder.<br />![http://www.fg85.de/acp/015.png](http://www.fg85.de/acp/015.png)<br />
  1. In the next step you must bind the content provider to your app.
    1. Open the **ContentProvider.xml** inside the src-gen folder and copy the line which starts with **<provier ...** and ends with **..defaultname" />**<br />![http://www.fg85.de/acp/016.png](http://www.fg85.de/acp/016.png)<br />
    1. Open the **AndroidManifest.xml** of your project.<br />![http://www.fg85.de/acp/017.png](http://www.fg85.de/acp/017.png)<br />
    1. Insert the copied line inside the **AndroidManifest.xml** inside the 

&lt;application&gt;

 element<br />![http://www.fg85.de/acp/018.png](http://www.fg85.de/acp/018.png)<br />
  1. Finally, the content provider is ready for use inside your Android project. How the Android Content Provider can be used, is described in another quickstart tutorial: http://code.google.com/p/mdsd-android-content-provider/wiki/consume_the_provider