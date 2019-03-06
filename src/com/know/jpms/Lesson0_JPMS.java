package com.know.jpms;

/**
 *  JPMS(Java Platform Module System)
 *  Replace JAR with Module to overcome following issues(java / class path hell) 
 *  until Java 8:
 *  - No prior analysis of dependencies causing NoClassDefFoundErro
 *  - Version Conflicts issue with jars
 *  - Security and Privacy Issue with jars
 *  - Monolithic behavior of JDK and JRE
 * 
 * jar like rt.jar tool.jar not supported any more, every thing is module from 
 * java 9.
 * In modular programming JVM check dependencies at the beginning of execution 
 * - ModuleInfo.java can used to remove version issue
 * - Specific package import provision is available 
 * - Each Module will only have related dependencies thus reducing JDK/JRE size 
 * 
 * @author KnowGroup
 */
public class Lesson0_JPMS {

}
