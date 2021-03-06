##X3D to MPEG7 eXist-db Extension Module

An XQuery module for extracting MPEG-7 annotation descriptions from .x3d files stored in the eXist-db database.
This module currently exposes one function for performing this task (validation against the extended MPEG-7 XSD Schema automatically included). 

You can find a demo of a working web app <a href="http://exist.webcatts.com" target="_blank">here</a>

## Installation

This module requires eXist-db 2.0 and has been tested with 2.2RC. 

The following steps require to stop the database from running, and start it again once installation complete.

Clone this repository, copy the mpeg7 folder from the src project folder to $EXIST_HOME/extensions/modules/src/org/exist/xquery/modules and run 
###

    $EXIST_HOME build.sh or build.bat extension-modules
    
to build the extensions directory. Edit the file extensions/build.properties and enable the extension as:

###

     <module uri="http://exist-db.org/xquery/mpeg7" class="org.exist.xquery.modules.mpeg7.MPEG7Module"/>

## Usage

### Import the module

    import module namespace mpeg7 = "http://exist-db.org/xquery/mpeg7";
    
### Function usage

* **mpeg7:batchTransform($path as item()) as xs:boolean**

This function extracts the MPEG-7 descriptions of all .x3d files stored in the given $path parameter, where $path is the relative path of the collection in the database.

    mpeg7:batchTransform('/db/apps/data/x3d')

* **mpeg7:singleTransform($collectionPath as item(), $fileName as item()) as xs:boolean**

This function extracts the MPEG-7 description of a single .x3d file defined as $filename. 
This resource is already stored in the given $path parameter, where $path is the relative path of the collection in the database.

    mpeg7:singleTransform('/db/apps/data/x3d','Geometry2D.x3d')

	
## Development

This extension is currently under continuous development in beta version 2.0b (stable).
