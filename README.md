# HelloHadoop
sample code for a hadoop application

Java SE 8 API:
https://docs.oracle.com/javase/8/docs/api/

Apache Hadoop Main 2.8.2 API:
http://hadoop.apache.org/docs/r2.8.2/api/

# hadoop commands
$ hadoop fs -help

# mvn commands
$ mvn exec:help
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building HelloWorld 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:help (default-cli) @ HelloWorld ---
[INFO] Exec Maven Plugin 1.6.0
  A plugin to allow execution of system and Java programs

This plugin has 3 goals:

exec:exec
  A Plugin for executing external programs.

exec:help
  Display help information on exec-maven-plugin.
  Call mvn exec:help -Ddetail=true -Dgoal=<goal-name> to display parameter
  details.

exec:java
  Executes the supplied java class in the current VM with the enclosing
  project's dependencies as classpath.


[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.835 s
[INFO] Finished at: 2017-11-26T13:37:07+08:00
[INFO] Final Memory: 11M/220M
[INFO] ------------------------------------------------------------------------

Note: it looks like that exec is the name of Exec Maven Plugin, it has three goals: exec, help, java

Another example:
$ mvn eclipse:help
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building HelloWorld 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-eclipse-plugin:2.10:help (default-cli) @ HelloWorld ---
[INFO] Apache Maven Eclipse Plugin 2.10
  The Eclipse Plugin is used to generate Eclipse IDE files (.project, .classpath
  and the .settings folder) from a POM.

This plugin has 12 goals:

eclipse:clean
  Deletes the .project, .classpath, .wtpmodules files and .settings folder used
  by Eclipse.

eclipse:configure-workspace
  Configures The following Eclipse Workspace features:
  - Adds the classpath variable MAVEN_REPO to Eclipse.
  - Optionally load Eclipse code style file via a URL.

eclipse:eclipse
  Generates the following eclipse configuration files:
  - .project and .classpath files
  - .setting/org.eclipse.jdt.core.prefs with project specific compiler settings
  - various configuration files for WTP (Web Tools Project), if the parameter
    wtpversion is set to a valid version (WTP configuration is not generated by
    default)
  If this goal is run on a multiproject root, dependencies between modules will
  be configured as direct project dependencies in Eclipse (unless
  useProjectReferences is set to false).

eclipse:help
  Display help information on maven-eclipse-plugin.
  Call mvn eclipse:help -Ddetail=true -Dgoal=<goal-name> to display parameter
  details.

eclipse:install-plugins
  Install plugins resolved from the Maven repository system into an Eclipse
  instance.

eclipse:myeclipse
  Generates MyEclipse configuration files

eclipse:myeclipse-clean
  Deletes configuration files used by MyEclipse

eclipse:rad
  Generates the rad-6 configuration files.

eclipse:rad-clean
  Deletes the config files used by Rad-6. the files .j2ee and the file
  .websettings

eclipse:remove-cache
  Removes the not-available marker files from the repository.

eclipse:resolve-workspace-dependencies
  For all projects currently part of the workspace, all references to the
  M2_REPO classpath variable are resolved.
  Note: not the projects of the reactor are inspected for unresolved artifacts,
  but the projects that are part of the workspace.

eclipse:to-maven
  Add eclipse artifacts from an eclipse installation to the local repo. This
  mojo automatically analize the eclipse directory, copy plugins jars to the
  local maven repo, and generates appropriate poms. This is the official central
  repository builder for Eclipse plugins, so it has the necessary default
  values. For customized repositories see MakeArtifactsMojo Typical usage: mvn
  eclipse:to-maven
  -DdeployTo=maven.org::default::scpexe://repo1.maven.org/home/maven/repository-staging/to-ibiblio/eclipse-staging
  -DeclipseDir=.


[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.695 s
[INFO] Finished at: 2017-11-26T13:39:45+08:00
[INFO] Final Memory: 13M/220M
[INFO] ------------------------------------------------------------------------

Note: eclipse is the name of Apache Maven Eclipse Plugin, it has 12 goals
