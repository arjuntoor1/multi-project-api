## Multi Project API

I use this repository to experiment with gradle multi-project builds.  I may use it as a container project in the future.

### Adding to projects

I find the easiest way is to do this from IntelliJ, though there probably is a nice way to do it using `gradle`.

1. Create a new directory for the subproject; the convention is that all names are kebab-cased and start with a common prefix, e.g. `arj-new-library` 
1. In `settings.gradle`, add the new subproject name to the `include`
1. Run "Load Gradle changes". There might be a specific task to do this. It just makes IntelliJ pick up the changes and sync up your project explorer properly
1. Voila, the new module should be scaffolded