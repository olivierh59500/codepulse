/*
 * Code Pulse: A real-time code coverage testing tool. For more information
 * see http://code-pulse.com
 *
 * Copyright (C) 2014 Applied Visions - http://securedecisions.avi.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import sbt._
import Keys._

object Dependencies {
	lazy val lift_webkit = "net.liftweb" %% "lift-webkit" % "2.5" % "compile->default"
	lazy val jettyWebapp = "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container"
	lazy val jettyOrbit = "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container" artifacts Artifact("javax.servlet", "jar", "jar")
	lazy val servletApi = "javax.servlet" % "javax.servlet-api"	% "3.1.0"
	lazy val logback = "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default"
	lazy val slf4j = "org.slf4j" % "jcl-over-slf4j" % "1.6.4"

	// testing
	lazy val junit = "junit" % "junit" % "4.5" % "test->default"
	lazy val specs = "org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test"
	lazy val scalatest = "org.scalatest" %% "scalatest" % "1.9.1" % "test"
	
	// extra libraries
	lazy val akka = "com.typesafe.akka" %% "akka-actor" % "2.2.3"
	lazy val reactive = "cc.co.scala-reactive" %% "reactive-core"	% "0.3.2.1"
	lazy val concLinkedHashMap = "com.googlecode.concurrentlinkedhashmap" % "concurrentlinkedhashmap-lru" % "1.2_jdk5"
	lazy val asm = Seq(
		"org.ow2.asm" % "asm" % "4.1",
		"org.ow2.asm" % "asm-commons" % "4.1"
	)
	lazy val jna = "net.java.dev.jna" % "jna" % "3.5.2"

	// database related
	lazy val slick = "com.typesafe.slick" %% "slick" % "2.0.1"
	lazy val h2 = "com.h2database" % "h2" % "1.3.170"
	
	// apache commons dependencies
	object commons {
		lazy val io = "commons-io" % "commons-io" % "2.1"
	}
	
	lazy val dependencyResolvers = Seq(
		"apache.repo" at "https://repository.apache.org/content/repositories/snapshots/",
		"sonatype.repo" at "https://oss.sonatype.org/content/repositories/snapshots/",
		"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
		"Typesafe IDE-2.10" at "http://repo.typesafe.com/typesafe/ide-2.10/"
	)
}