## Sample for wrapping a play app with another play app

### Key points

* playTwo will wrap playOne - Will also add some new test routes
* The only change for playOne is to rename their route file (and make a new default route file, mapping all routes to the new route)
* Look at playTwo/routes to see how playApp one is referenced 
* The build.sbt makes playTwo dependOn and aggregate playOne


**Note this is a proof of concept after multiple failures on an existing project** 