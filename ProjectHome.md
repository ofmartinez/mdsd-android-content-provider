# Model Driven Software Development: Android Content Provider #
With this plugin it is possible to generate the Android Content Provider + Database + Model from an ecore domain model.




## News ##
  * 05.11.2012 - New improvement: model classes with content values and cursors constructor, Blob and ByteArray support.
  * 06.01.2012 - New improvement: own package and authority names. Now you can set your own package names and content provider authority of the generated sources. Thank you to **Oleg M**<br />_"Added support for custom package name for generated classes. It works so if nsURI of the ECore ePackage is valid Java package name (e.g. "aaa.bbb.ccc") then it is used, in the other case everything works like older version (with predefined package name)."_ <br />Wiki: [Package And Authority Name](http://code.google.com/p/mdsd-android-content-provider/wiki/PackageAndAuthorityName)
  * 09.08.2011 - Bugfixes and improvements in acpgen module (version 0.9.8)
  * Tested with Eclipse Indigo (3.7). It works! Now it's only necessary to install xText via the Eclipse Marketplace, because Xpand is already included.

## Announcement ##
  * Conference: [Entwicklertag 2011 Karlsruhe - 05.26.2011](http://www.andrena.de/Entwicklertag/2011/Programm/Conference-Day.html)

## Requirements ##
  * [Eclipse with Modeling Tools (SR2)](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools-includes-incubating-components/heliossr2) (additional required plugins: XText & Xpand) or [Eclipse Modeling Tools](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/indigor) (additional required plugins: XText)
  * [Android SDK](http://developer.android.com/sdk/installing.html)
  * [Android Eclipse Plugin](http://developer.android.com/sdk/eclipse-adt.html)

## Installation ##
A detailed installation tutorial is available in the [wiki](http://code.google.com/p/mdsd-android-content-provider/wiki/Installation)
  1. Download the **[MDSDACP](http://mdsd-android-content-provider.googlecode.com/files/de.mdsdacp.eclipse.plugin_0.9.6.jar)** and the **[Android Content Provider Generation](http://mdsd-android-content-provider.googlecode.com/files/de.mdsdacp.acpgen_0.9.8.jar)** Eclipse Plugin
  1. Copy both plugins in the **/eclipse/dropins/** folder
  1. start / restart Eclipse

## How to use ##
A detailed "How to use" Guide is now available in the [wiki](http://code.google.com/p/mdsd-android-content-provider/wiki/Quickstart)
  1. Create a new Android Project
  1. Create a Model with right click on the project, "New -> Other -> Android -> Android Content Provider Model"
  1. Select the project and the model name and press finish. A model folder will be created in your selected project which contains an ecore and an ecorediag file.
  1. Now start modelling your model in the ecore or ecorediag file.
  1. Generate the content provider by clicking right on the ecore file and select "Android Tools -> Generate Content Provider". The content provider is generated in the src-gen folder
  1. Now copy the xml snippet form the **"ContentProvider.xml"** file in the src-gen folder into your  **"AndroidManifest.xml"** between the **`<application>`** and **`</appliaction>`** tag.
  1. Your are done. Now you can use the content provider in your or in another app

[![](http://www.fg85.de/acp.png)](http://www.gfred.de/)